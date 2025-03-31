class ProduksiJaket {

    // final artinya variabelnya sudah fix dan tidak bisa diubah lagi, dan biasanya namanya huruf besar semua
    private static final int HARGA_A = 100000;
    private static final int HARGA_B = 125000;
    private static final int HARGA_C = 175000;

    // harga ketika dibeli diatas jumlah 100
    private static final int DISKON_A = 95000;
    private static final int DISKON_B = 120000;
    private static final int DISKON_C = 160000;

    public int hitungTotal(String tipe, int jumlah) { // method harga tipe apa untuk jumlah berapa
        int harga;

        switch (tipe.toUpperCase()) {  // Ubah ke huruf besar agar input fleksibel

            // kalau jumlah diatas 100 pakai yang diskon, kalau 100 kebawah pakai harga normal
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
