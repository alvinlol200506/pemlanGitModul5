public class PemdasPraktikumModul5 {
    public static void main(String[] args) {

        int hasil1 = Kalkulator.add(99, 234);
        int hasil2 = Kalkulator.subtract(420, 69);

        Kalkulator calc = new Kalkulator();

        int hasil3 = calc.times(4, 7);
        int hasil4 = calc.divide(300, 10);
        int hasil5 = calc.Sederhana(18, 24);

        System.out.println("Hasil penjumlahan: " + hasil1);
        System.out.println("Hasil pengurangan: " + hasil2);
        System.out.println("Hasil perkalian: " + hasil3);
        System.out.println("Hasil pembagian: " + hasil4);
        System.out.println("Hasil penyederhanaan: " + hasil5);
    }
}


