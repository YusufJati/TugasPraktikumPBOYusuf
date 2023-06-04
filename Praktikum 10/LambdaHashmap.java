/* 
 *  Nama: Muhamad Aditya Yusuf / 24060121140157
 *  Lab: B1
 *  Nama File:MapMhs.java
 *  Tanggal Membuat: 3 Juni 2023
 *  Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
 */

import java.util.HashMap;

public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("001", "Rudi");
        mahasiswaMap.put("002", "Ridwan");
        mahasiswaMap.put("003", "Ridho");
        mahasiswaMap.put("004", "Ridha");

        // dengan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}
