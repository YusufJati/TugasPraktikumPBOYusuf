/*
 * Asersi2.java
 * nama file: Asersi2.java
 * Pembuat: Muhamad Aditya Yusuf
 * Tanggal dibuat: 29 Maret 2023
 * Deskripsi: file asersi2 yang merupakan implementasi dari Asersi
 */
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        return 2 * Math.PI * jariJari;
    }
}



public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "jari-jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
} // Secara konsep, tidak terdapat kesalahan pada program ini karena 
    //nilai jari-jari tidak boleh nol. Namun, jika nilai jari-jari adalah nol,
    // maka program akan menghasilkan keliling lingkaran 0.0. Oleh karena itu, 
    //asersi dapat digunakan untuk memastikan bahwa nilai jari-jari tidak boleh nol.
