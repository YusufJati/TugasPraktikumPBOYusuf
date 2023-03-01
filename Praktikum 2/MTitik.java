public class MTitik {
    // private double absis,ordinat;
    public static void main(String[] args) {
        Titik t, t4;
        t = new Titik(1, 2);
        t4 = new Titik(3, 4);
        OperasiTitik op = new OperasiTitik();
        op.refleksiX(t4);
        op.refleksiY(t);
        System.out.println("Setelah dibalikkan: " + "Titik t: (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        System.out.println("Setelah dibalikkan: " + "Titik t4: (" + t4.getAbsis() + "," + t4.getOrdinat() + ")");

    }
}
