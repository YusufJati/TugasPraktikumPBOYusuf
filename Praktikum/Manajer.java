/*
 * Nama Pembuat : Muhamad Aditya Yusuf
 * NIM           : 24060121140157
 * Lab          : PBO B
 * Tanggal      : 3 Mei 2023
 */
package Tugas;

public class Manajer extends Pegawai {
    private int tunjangan = 7000000;

    public Manajer(String nama){
        this.setNama(nama);
    }

    void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: " + this.tunjangan);
    }
}
