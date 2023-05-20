/*
 * Nama File          : BangunDatarGeneric.java
 * Tanggal            : 17 Mei 2023
 * Deskripsi          : Kelas BangunDatarGeneric
 */

public class BangunDatarGeneric<T234 extends BangunDatar> { // T telah diganti dengan T234
    private T234 bangunDatar;

    public void set(T234 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T234 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
    /* Kesimpulan jika T pada file ini diganti adalah tidak menimbulkan error
    karena T pada file ini tidak digunakan sebagai parameter generic
    pada method, sehingga tidak perlu diganti dengan T234
     */
}
