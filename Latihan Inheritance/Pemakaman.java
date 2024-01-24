import java.util.Scanner;

public class Pemakaman {
    protected String namaPemakaman;
    protected String alamat;
    protected int jumlahMakam;
    private String nomorTelepon;

    public Pemakaman(String namaPemakaman, String alamat, int jumlahMakam, String nomorTelepon) {
        this.namaPemakaman = namaPemakaman;
        this.alamat = alamat;
        this.jumlahMakam = jumlahMakam;
        this.nomorTelepon = nomorTelepon;
    }

    public void displayInfo() {
        System.out.println("\nInformasi Pemakaman:");
        System.out.println("Nama Pemakaman: " + namaPemakaman);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Makam: " + jumlahMakam);
        System.out.println("No. Tlpn: " + nomorTelepon);
    }
}
