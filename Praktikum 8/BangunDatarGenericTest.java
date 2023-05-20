/*
 * Nama File          : BangunDatarGenericTest.java
 * Tanggal            : 17 Mei 2023
 * Deskripsi          : kelas konstruksi untuk kelas BangunDatarGeneric
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
    }
}
