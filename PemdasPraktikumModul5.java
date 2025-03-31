public class PemdasPraktikumModul5 {
    public static void main(String[] args) {

        System.out.println("===============MATEMATIKA===============");

        int hasil1 = Kalkulator.add(99, 234);
        int hasil2 = Kalkulator.subtract(420, 69);

        Kalkulator calc = new Kalkulator();

        int hasil3 = calc.times(4, 7);
        int hasil4 = calc.divide(300, 10);

        System.out.println("Hasil penjumlahan: " + hasil1);
        System.out.println("Hasil pengurangan: " + hasil2);
        System.out.println("Hasil perkalian: " + hasil3);
        System.out.println("Hasil pembagian: " + hasil4);

        calc.Sederhana(18, 24);

        ProduksiJaket jaket = new ProduksiJaket();

        System.out.println("\n===============JAKET===============");
        System.out.println("Total harga Jaket A (150 buah): Rp" + jaket.hitungTotal("A", 150));
        System.out.println("Total harga Jaket B (90 buah): Rp" + jaket.hitungTotal("B", 90));
        System.out.println("Total harga Jaket C (120 buah): Rp" + jaket.hitungTotal("C", 120));
    }
}


