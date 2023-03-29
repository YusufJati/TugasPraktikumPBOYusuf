/*
 * BangunDatar.java
 * Nama file: BangunDatar.java
 * Pembuat: Muhamad Aditya Yusuf
 * Tanggal dibuat: 29 Maret 2023
 * Deskripsi: Kelas abstrak BangunDatar
 *
 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
    
}