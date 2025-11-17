package assignment;

public class Order {

    private Barang[] listBarang = new Barang[20];
    private int idx = 0;

    public void tambahBarang(Barang b) {
        if (idx < listBarang.length) {
            listBarang[idx] = b;
            idx++;
        }
    }

    public void tampilPesanan() {
        if (idx == 0) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        for (int i = 0; i < idx; i++) {
            System.out.println("----- DATA BARANG -----");
            listBarang[i].tampil();
            System.out.println();
        }
    }
}
