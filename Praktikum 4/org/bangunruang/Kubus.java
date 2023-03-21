/*
 * Nama file: Kubus.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 8 Maret 2023
 * Deskripsi: Class Kubus
 * Lab: B1
 */
package org.bangunruang;
import org.bangundatar.BujurSangkar;
public class Kubus{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }
    public double hitungVolume(){
        return permukaan.hitungLuas() * permukaan.getPanjangSisi();
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}
