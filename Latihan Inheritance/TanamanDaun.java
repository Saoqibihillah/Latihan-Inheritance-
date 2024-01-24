class TanamanDaun extends Tanaman {
    // Konstruktor
    public TanamanDaun(String jenis, int harga) {
        super(jenis, harga);
    }

    // Implementasi metode abstrak
    @Override
    public String getDeskripsi() {
        return "Jenis Tanaman Daun " + getJenis();
    }
}
