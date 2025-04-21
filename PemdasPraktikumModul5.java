public class PemdasPraktikumModul5 {
    public static void main(String[] args) {

        System.out.println("===============MATEMATIKA===============");

        int hasil1 = Kalkulator.add(99, 234); // langsung memanggil method penambahan di dalam class dengan
        int hasil2 = Kalkulator.subtract(420, 69); // langsung memanggil method pengurangan di dalam class

        Kalkulator calc = new Kalkulator(); // ditetapkan dulu objeknya, ndak langsung akses classnya

        int hasil3 = calc.times(4, 7); // manggil method lewat objek
        int hasil4 = calc.divide(300, 20); // manggil method lewat objek

        // ngeprint hasil perhitungan di atas
        System.out.println("Hasil penjumlahan: " + hasil1);
        System.out.println("Hasil pengurangan: " + hasil2);
        System.out.println("Hasil perkalian: " + hasil3);
        System.out.println("Hasil pembagian: " + hasil4);

        calc.Sederhana(18, 24); // melakukan penyederhanaan antara pembilang dengan penyebut

        ProduksiJaket jaket = new ProduksiJaket(); // membuat objek untuk ProduksiJaket() karena semua methodnya non-static

        System.out.println("\n===============JAKET===============");
        System.out.println("Total harga Jaket A (150 buah): Rp" + jaket.hitungTotal("A", 150)); // kalau jaket ini bakal menggunakan harga yang 95k (normalnya 100k)
        System.out.println("Total harga Jaket B (90 buah): Rp" + jaket.hitungTotal("B", 90)); // kalau jaket ini tetep pakai harga normal 125k (kalau diskon 120k)
        System.out.println("Total harga Jaket C (120 buah): Rp" + jaket.hitungTotal("C", 120)); // kalau jaket ini bakal pakai harga yang 160k (normalnya 175k)


    }
}


