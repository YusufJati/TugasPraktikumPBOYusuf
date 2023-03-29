/*
 * MLingkaran.java
 * Nama file: MLingkaran.java
 * Pembuat: Muhamad Aditya Yusuf
 * Tanggal dibuat: 29 Maret 2023
 * Deskripsi: Main class dari Lingkaran
 *
 */
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jejari: ");
        double jejari = input.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jejari);
        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
    }
}
