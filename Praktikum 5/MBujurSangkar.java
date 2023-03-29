import java.util.Scanner;

/*
 * MBujurSangkat.java
 * Nama file: MBujurSangkar.java
 * Pembuat: Muhamad Aditya Yusuf
 * Tanggal dibuat: 29 Maret 2023
 * Deskripsi: Kelas main BujurSangkar
 *
 */

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi) + " satuan luas");
        
    }
}
