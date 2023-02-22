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