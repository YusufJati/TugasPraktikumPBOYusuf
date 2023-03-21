/*
 * Nama file: MKubus.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 15 Maret 2023
 * Deskripsi: Class MKubus
 * Lab: B1
 */

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.*;
public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(5.0);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasAlas());

    }
}
