/*
 * Nama Pembuat : Muhamad Aditya Yusuf
 * NIM           : 24060121140157
 * Lab          : PBO B
 * Tanggal      : 3 Mei 2023
 */
package Tugas;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    void setNama(String nama){
        this.nama = nama;
    }

    void tampilData(){
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("Gaji Pokok: " + this.gajiPokok);
    }
}
