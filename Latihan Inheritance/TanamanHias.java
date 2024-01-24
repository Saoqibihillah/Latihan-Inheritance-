class TanamanHias extends Tanaman {
    private String jenisBunga;

    // Konstruktor
    public TanamanHias(String jenis, int harga, String jenisBunga) {
        super(jenis, harga);
        this.jenisBunga = jenisBunga;
    }

    // Getter
    public String getJenisBunga() {
        return jenisBunga;
    }

    // Implementasi metode abstrak
    @Override
    public String getDeskripsi() {
        return "Jenis Tanaman Hias " + getJenis() + " dengan bunga " + jenisBunga;
    }
}
