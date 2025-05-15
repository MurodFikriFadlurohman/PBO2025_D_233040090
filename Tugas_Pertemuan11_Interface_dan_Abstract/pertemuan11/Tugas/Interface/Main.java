package pertemuan11.Tugas.Interface;

public class Main {
    public static void main(String[] args) {
        Pembayaran p1 = new TransferBank();
        Pembayaran p2 = new DompetDigital();

        p1.tampilkanMetode();
        p1.prosesPembayaran(150000);

        p2.tampilkanMetode();
        p2.prosesPembayaran(75000);
    }
}
