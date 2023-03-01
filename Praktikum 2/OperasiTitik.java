/*
 * Nama file: OperasiTitik.java
 * Pembuat: Muhamad Aditya Yusuf
 * NIM: 24060121140157
 * Tanggal: 1 Maret 2023
 * Deskripsi: Class OperasiTitik
 * Lab: B1
 */
class OperasiTitik{
    // Atribut
    //private Titik t;

    // Konstruktor


    // Method
    private void refeksiSumbuX(Titik titik){
        double ordinat = titik.getOrdinat();
        titik.setOrdinat(-1 * ordinat);
    }

    private void refeksiSumbuY(Titik titik){
        double absis = titik.getAbsis();
        titik.setAbsis(-1 * absis);
    }

    public void refleksiX(Titik t){
        refeksiSumbuX(t);
    }

    public void refleksiY(Titik t){
        refeksiSumbuY(t);
    }
}