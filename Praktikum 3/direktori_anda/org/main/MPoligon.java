/*
 * Nama file: MTitik.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 8 Maret 2023
 * Deskripsi: Class MPoligon
 * Lab: B1
 */

package direktori_anda.org.main;

import direktori_anda.org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(10, 10,3);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());
        segitiga.printInfo();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}
