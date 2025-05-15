package pertemuan11.Tugas.Interface;

public class DompetDigital implements Pembayaran {
    public void prosesPembayaran(double jumlah) {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah + " melalui Dompet Digital.");
    }

    public void tampilkanMetode() {
        System.out.println("Metode: Dompet Digital");
    }
}

