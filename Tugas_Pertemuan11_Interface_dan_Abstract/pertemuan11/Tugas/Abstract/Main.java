package pertemuan11.Tugas.Abstract;

public class Main {
    public static void main(String[] args) {
        Kendaraan m1 = new Mobil("Toyota");
        Kendaraan m2 = new Motor("Honda");

        m1.info();
        m1.nyalakanMesin();

        m2.info();
        m2.nyalakanMesin();
    }
}
