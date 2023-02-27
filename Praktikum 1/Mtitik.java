/*
Nama File: Mtitik.java
Deskrpsi: file main dari class titik
Pembuat: Muhamad Aditya Yusuf Jatikusumo
NIM: 24060121140157
Tanggal: 27 Februari 2023
*/

public class Mtitik {
    // Atribut
    static double counter;
    // Algoritma
    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik(5,6);
        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        System.out.println("Jumlah objek titik: " + (int) Titik.getCounterTitik());
        System.out.println("Titik 1: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Titik 2: (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("Titik 3: (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    }

}
