/* 
 *  Nama: Muhamad Aditya Yusuf / 24060121140157
 *  Lab: B1
 *  Nama File:DiskonLambda.java
 *  Tanggal Membuat: 3 Juni 2023
 *  Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga *  0.3);
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4); 
        IDiskon diskonBiasa = (harga) -> {return harga - (harga * 0.1);}; 

        System.out.println("Harga setelah diskon merdeka: Rp." + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Harga setelah diskon lebaran: Rp." + diskonLebaran.hitungDiskon(45000));
        System.out.println("Harga setelah diskon biasa: Rp." + diskonBiasa.hitungDiskon(45000));

    }
}