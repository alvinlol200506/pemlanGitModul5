public class Kalkulator {

    public static int add(int angka1, int angka2){
        return angka1 + angka2;
    }

    public static int subtract(int angka1, int angka2){
        return angka1 - angka2;
    }

    public int times(int angka1, int angka2){
        return angka1 * angka2;
    }

    public int divide(int angka1, int angka2){
        if(angka1 == 0 || angka2 == 0){
            System.out.println("!!Tak terbatasssssss!!");
            return 0;
        } else {
            return angka1 / angka2;
        }
    }

    public void Sederhana(int pembilang, int penyebut) {
        int fpb = cariFPB(pembilang, penyebut);
        int newpembilang = pembilang / fpb;
        int newpenyebut = penyebut / fpb;
        System.out.println("Hasil penyederhanaan: " + newpembilang + "/" + newpenyebut);
    }

    private int cariFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
