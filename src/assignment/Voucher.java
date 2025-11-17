package assignment;

public class Voucher extends Barang {

    private double ppn;

    public Voucher(String id, String nama, int harga, int stok, double ppn) {
        super(id, nama, harga, stok);
        this.ppn = ppn;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("PPN : " + ppn);
    }
}
