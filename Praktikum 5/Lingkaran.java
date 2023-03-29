/*
 * MLingkaran.java
 * Nama file: Lingkaran.java
 * Pembuat: Muhamad Aditya Yusuf
 * Tanggal dibuat: 29 Maret 2023
 * Deskripsi: Kelas implementasi dari IArea untuk menghitung luas lingkaran
 *
 */
import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
