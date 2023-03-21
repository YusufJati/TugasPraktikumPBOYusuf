/*
 * Nama file: BujurSangkar.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 15 Maret 2023
 * Deskripsi: Class BujurSangkar
 * Lab: B1
 */

package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;
    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }
    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi(){
        return panjangSisi;
    }
}
