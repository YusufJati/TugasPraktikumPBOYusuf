/*
 * Nama Pembuat : Muhamad Aditya Yusuf
 * NIM           : 24060121140157
 * Lab          : PBO B
 * Tanggal      : 3 Mei 2023
 */
package Tugas;

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai1 = new Manajer("Rizky");
        Pegawai pegawai2 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
    }
}
