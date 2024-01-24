abstract class Tanaman {
    private String jenis;
    private int harga;

    // Konstruktor
    public Tanaman(String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    // Metode abstrak untuk mendapatkan deskripsi tanaman
    public abstract String getDeskripsi();
}
