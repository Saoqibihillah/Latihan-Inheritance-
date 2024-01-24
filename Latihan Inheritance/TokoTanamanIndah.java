import java.util.Scanner;

public class TokoTanamanIndah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data pelanggan
        System.out.print("=============================\n----welcome toko tanaman indah------\n=============================\n");
        System.out.print("Masukkan Nama pelanggan : ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan No.Tlpn Pelanggan : ");
        String noTlpnPelanggan = scanner.nextLine();
        // Membersihkan buffer
        System.out.print("Input tanaman lagi [y/t] ? ");
        scanner.nextLine();
        // Membuat objek Transaksi
        Transaksi transaksi = new Transaksi(namaPelanggan, noTlpnPelanggan);

        // Melakukan transaksi pembelian tanaman
        transaksi.beliTanaman(scanner);

        // Menampilkan total pembayaran
        System.out.println("\nTotal Yang Harus Dibayar : Rp. " + transaksi.getTotalPembayaran());

        // Menampilkan pesan terima kasih
        System.out.println("\n==============================================================================");
        System.out.println("—Terima kasih " + namaPelanggan + " sudah membeli Tanaman di Toko Tanaman Indah—");
        System.out.println("================================================================================");
        System.out.println("——--------——Keindahan dan Kesegaran tanaman Disini Tempatnya—----------------———");
        System.out.println("================================================================================");
    }
}
