import java.util.Scanner;

class Transaksi {
    private String namaPelanggan;
    private String noTlpnPelanggan;
    private int totalPembayaran;

    // Konstruktor
    public Transaksi(String namaPelanggan, String noTlpnPelanggan) {
        this.namaPelanggan = namaPelanggan;
        this.noTlpnPelanggan = noTlpnPelanggan;
        this.totalPembayaran = 0;
    }

    // Getter
    public int getTotalPembayaran() {
        return totalPembayaran;
    }

    // Metode untuk melakukan transaksi pembelian tanaman
    public void beliTanaman(Scanner scanner) {
        char inputLagi;

        do {
            // Menampilkan jenis tanaman yang tersedia
            System.out.println("\nJenis Tanaman Yang Tersedia : ");
            System.out.println("1. Tanaman Hias");
            System.out.println("2. Tanaman Daun");

            System.out.print("Pilihan Tanaman : ");
            int pilihanJenisTanaman = scanner.nextInt();

            // Variabel untuk menyimpan pilihan tanaman
            Tanaman tanaman = null;

            switch (pilihanJenisTanaman) {
                case 1:
                    tanaman = pilihTanamanHias(scanner);
                    break;
                case 2:
                    tanaman = pilihTanamanDaun(scanner);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Memproses pembelian tanaman
            if (tanaman != null) {
                System.out.print("Banyaknya Tanaman Yang Dibeli (Pot) : ");
                int jumlahBeli = scanner.nextInt();

                // Menambahkan harga tanaman ke total pembayaran
                totalPembayaran += tanaman.getHarga() * jumlahBeli;

                System.out.println("Berhasil ditambahkan");
                System.out.println("Harga sebesar : Rp. " + tanaman.getHarga() * jumlahBeli + ".");
            }

            // Menanyakan apakah ingin memasukkan tanaman lagi
            System.out.print("Input tanaman lagi [y/t] ? ");
            inputLagi = scanner.next().charAt(0);

        } while (inputLagi == 'y');
    }

    // Metode untuk memilih tanaman hias
    private Tanaman pilihTanamanHias(Scanner scanner) {
        System.out.println("\n   Jenis Tanaman Hias Bunga");
        System.out.println("1. Mawar      Rp.50000");
        System.out.println("2. Lily.           Rp.150000");
        System.out.println("3. Anggrek.   Rp.250000");

        System.out.print("Pilihan Anda : ");
        int pilihanTanamanHias = scanner.nextInt();

        switch (pilihanTanamanHias) {
            case 1:
                return new TanamanHias("Mawar", 50000, "Bunga Mawar");
            case 2:
                return new TanamanHias("Lily", 150000, "Bunga Lily");
            case 3:
                return new TanamanHias("Anggrek", 250000, "Bunga Anggrek");
            default:
                System.out.println("Pilihan tidak valid.");
                return null;
        }
    }

    // Metode untuk memilih tanaman daun
    private Tanaman pilihTanamanDaun(Scanner scanner) {
        System.out.println("\n   Jenis Tanaman Has Daun ");
        System.out.println("1. Caladium.  Rp. 55000");
        System.out.println("2. Aglonema. Rp. 120000");
        System.out.println("3. Honastrea. Rp. 300000");

        System.out.print("Pilihan Anda : ");
        int pilihanTanamanDaun = scanner.nextInt();

        switch (pilihanTanamanDaun) {
            case 1:
                return new TanamanDaun("Caladium", 55000);
            case 2:
                return new TanamanDaun("Aglonema", 120000);
            case 3:
                return new TanamanDaun("Honastrea", 300000);
            default:
                System.out.println("Pilihan tidak valid.");
                return null;
        }
    }
}
