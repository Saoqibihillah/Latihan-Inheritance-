import java.util.Scanner;

public class ProgramPemakaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("——————————Welcome TPU Jeruk Perut— ———————");
        System.out.println("===================================================");

        // Input informasi pemakaman
        System.out.print("Masukkan Nama Pemakaman: ");
        String namaPemakaman = scanner.nextLine();

        System.out.print("Masukkan Alamat Pemakaman: ");
        String alamatPemakaman = scanner.nextLine();

        System.out.print("Masukkan Jumlah Makam: ");
        int jumlahMakam = scanner.nextInt();

        System.out.print("No. Tlpn: ");
        String nomorTelepon = scanner.next();

        // Membuat objek Pemakaman
        Pemakaman pemakaman = new Pemakaman(namaPemakaman, alamatPemakaman, jumlahMakam, nomorTelepon);

        System.out.println("——————————————————————————————");

        // Input informasi jenazah
        scanner.nextLine(); // Membersihkan newline
        System.out.print("Masukkan Nama Almarhum: ");
        String namaAlmarhum = scanner.nextLine();

        System.out.print("Masukkan Usia Almarhum: ");
        int usiaAlmarhum = scanner.nextInt();

        // Membuat objek Jenazah
        Jenazah jenazah = new Jenazah(namaPemakaman, alamatPemakaman, jumlahMakam, nomorTelepon, namaAlmarhum, usiaAlmarhum);

        // Menampilkan informasi pemakaman dan jenazah
        jenazah.tampilkanInformasiJenazah();

        System.out.println("——————————————————————————————");
        System.out.println("\n====================================================");
        System.out.println("————————Terima kasih TPU Jeruk Perut—————————");
        System.out.println("====================================================");

        scanner.close();
    }
}
