/*
 * Nama file: MTitik.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 8 Maret 2023
 * Deskripsi: Class Segitiga
 * Lab: B1
 */

package org.bangundatar;
import org.poligon.Poligon;


public class Segitiga extends Poligon {
    private double alas,tinggi;

    public Segitiga(double alas, double tinggi,int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi());
    }
}
