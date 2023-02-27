/*
Nama File: Titik.java
Deskrpsi: file class titik
Pembuat: Muhamad Aditya Yusuf Jatikusumo
NIM: 24060121140157
Tanggal: 27 Februari 2023
*/

class Titik{
    // Atribut
    double absis,ordinat;
    static double counter;

    // Konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counter++;
    }

    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counter++;
    }
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static double getCounterTitik(){
        return counter;
    }
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double b){
        ordinat = b;
    }

}
