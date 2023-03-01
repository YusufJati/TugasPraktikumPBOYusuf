/*
 * Nama file: MTitik.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 1 Maret 2023
 * Deskripsi: Class MTitik
 * Lab: B1
 */

public class MTitik {
    // private double absis,ordinat;
    public static void main(String[] args) {
        Titik t, t4;
        t = new Titik(1, 2);
        t4 = new Titik(3, 4);
        System.out.println("Titik t: (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        System.out.println("Titik t4: (" + t4.getAbsis() + "," + t4.getOrdinat() + ")");
        OperasiTitik op = new OperasiTitik();

        op.refleksiX(t4);
        op.refleksiY(t);
        System.out.println("Setelah direfleksi: " + "Titik t: (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        System.out.println("Setelah direfleksi: " + "Titik t4: (" + t4.getAbsis() + "," + t4.getOrdinat() + ")");

    }
}
