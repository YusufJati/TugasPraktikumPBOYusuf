/*
 * Nama Pembuat : Muhamad Aditya Yusuf
 * NIM           : 24060121140157
 * Lab          : PBO B
 * Tanggal      : 3 Mei 2023
 */


public class Programmer extends Pegawai {
    private int bonus = 45000;

    public Programmer(String nama){
        this.setNama(nama);;
    }

    void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + this.bonus);
    }
}
