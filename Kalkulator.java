public class Kalkulator {

    public static int add(int angka1, int angka2){ // nanti tinggal dipanggil Kalkulator.add instead of harus dibuat objeknya dulu di main
        return angka1 + angka2; // mengembalikan nilai penjumlahan
    }

    public static int subtract(int angka1, int angka2){ // nanti tinggal dipanggil Kalkulator.subtract instead of harus dibuat objeknya dulu di main
        return angka1 - angka2; // mengembalikan nilai pengurangan
    }

    public int times(int angka1, int angka2){ // perlu dibikin dulu objek baru dipanggil
        return angka1 * angka2; // mengembalikan nilai perkalian
    }

    public int divide(int angka1, int angka2){ // perlu dibikin dulu objek baru dipanggil
        if(angka1 == 0 || angka2 == 0){ // kalau salah satunya 0 hasilnya ndak terbatas tapi di Java agak kocak jadi mending return 0 aja
            return 0;
        } else {
            return angka1 / angka2; // mengembalikan nilai pembagian
        }
    }

    public void Sederhana(int pembilang, int penyebut) { // perlu dibikin objek baru dipanggil
        int fpb = cariFPB(pembilang, penyebut); // memanggil method cariFPB di class ini (private)
        int newpembilang = pembilang / fpb; // disederhanankan dengan dibagi dg fpb
        int newpenyebut = penyebut / fpb; // disederhanankan dengan dibagi dg fpb
        System.out.println("Hasil penyederhanaan: " + newpembilang + "/" + newpenyebut); // ngeprint di terminal
    }

    private int cariFPB(int a, int b) {
        while (b != 0) { // selama b belum 0 maka berjalan terus sampai jadi 0
            int temp = b; // menyimpan sementara b dan nanti dituker sama a biar nanti bisa dicek sisa a dari b dan b dari a
            b = a % b; // cara mengetahui bahwa fpb adalah ketika a bisa dibagi b, selain itu di bagian ini sisanya b harusnya lebih kecil dari sebelumnya dan bakal dicobain terus sama a, dituker juga antara a sama b biar hasilnya bisa semakin kecil dan sampai di titik dimana sisanya 0, dan itulah fpbnya
            a = temp; // nuker a dengan b sebelmnya
        }
        return Math.abs(a); // disaat bnya 0 maka anya sudah menyimpan berapa b dimana itu fpbnya, dan Math.abs(a) simply cuman mutlak dari a atau |a|
    }
}
