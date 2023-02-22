public class Mtitik {
    static double counter;

    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        System.out.println("Jumlah objek titik: " + (int) Titik.getCounterTitik());
        System.out.println("Titik 1: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Titik 2: (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
    }

}
