package pertemuan11.Tugas.Interface;

public class TransferBank implements Pembayaran {
    public void prosesPembayaran(double jumlah) {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah + " melalui Transfer Bank.");
    }

    public void tampilkanMetode() {
        System.out.println("Metode: Transfer Bank");
    }
}

