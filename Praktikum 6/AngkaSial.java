/*
 * AngkaSial.java
 * Pembuat: Muhamad Aditya Yusuf
 * Nama file: AngkaSial.java
 * Tanggal dibuat: 29 Maret 2023
 * Deskripsi: file angkasial yang merupakan implementasi dari Asersi
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13){
            throw new AngkaSialException();
        }System.out.println("angka yang dipilih: " + angka);
    }

    public static void main(String[] args) {
        AngkaSial angkaSial = new AngkaSial();
        try {
            angkaSial.cobaAngka(13);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!");
        }
    }
} /* 
Ketika eksepsi terjadi, baris ke 12 tidak dapat dieksekusi 
dan pada baris ke 21 dapat dieksekusi*/
