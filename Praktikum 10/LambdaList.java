/* 
 *  Nama: Muhamad Aditya Yusuf / 24060121140157
 *  Lab: B1
 *  Nama File: LambdaList.java
 *  Tanggal Membuat: 3 Juni 2023
 *  Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Rudi");
        mahasiswaList.add("Ridwan");
        mahasiswaList.add("Ridho");
        mahasiswaList.add("Ridha");

        // dengan lambda
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
