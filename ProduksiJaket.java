class ProduksiJaket {

    private static final int HARGA_A = 100000;
    private static final int HARGA_B = 125000;
    private static final int HARGA_C = 175000;

    private static final int DISKON_A = 95000;
    private static final int DISKON_B = 120000;
    private static final int DISKON_C = 160000;

    public int hitungTotal(String tipe, int jumlah) {
        int harga;

        switch (tipe.toUpperCase()) {  // Ubah ke huruf besar agar input fleksibel
            case "A":
                harga = (jumlah > 100) ? DISKON_A : HARGA_A;
                break;
            case "B":
                harga = (jumlah > 100) ? DISKON_B : HARGA_B;
                break;
            case "C":
                harga = (jumlah > 100) ? DISKON_C : HARGA_C;
                break;
            default:
                System.out.println("Tipe jaket tidak valid!");
                return 0; // Jika tipe tidak valid, kembalikan 0
        }

        return harga * jumlah; // Hitung total harga
    }
}
