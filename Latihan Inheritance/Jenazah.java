public class Jenazah extends Pemakaman {
    private String namaAlmarhum;
    private int usia;

    public Jenazah(String namaPemakaman, String alamat, int jumlahMakam, String nomorTelepon, String namaAlmarhum, int usia) {
        super(namaPemakaman, alamat, jumlahMakam, nomorTelepon);
        this.namaAlmarhum = namaAlmarhum;
        this.usia = usia;
    }

    public String getNamaAlmarhum() {
        return namaAlmarhum;
    }

    public void tampilkanInformasiJenazah() {
        System.out.println("\nInformasi Jenazah:");
        System.out.println("Nama Almarhum: " + namaAlmarhum);
        System.out.println("Usia: " + usia + " tahun");
        displayInfo();
    }
}
