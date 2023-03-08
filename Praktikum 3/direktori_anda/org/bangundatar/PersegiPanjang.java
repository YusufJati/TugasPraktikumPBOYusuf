/*
 * Nama file: MTitik.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 8 Maret 2023
 * Deskripsi: Class PersegiPanjang
 * Lab: B1
 */

package direktori_anda.org.bangundatar;

import direktori_anda.org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar,int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang berisi " + this.getJumlahSisi());
    }
}
