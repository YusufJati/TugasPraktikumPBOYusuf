/*
 * Nama File          : Lingkaran.java
 * Tanggal            : 17 Mei 2023
 * Deskripsi          : implementasi lingkaran sebagai bangun datar
 */

public class Lingkaran  extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * 3.14 * jejari;
    }
}