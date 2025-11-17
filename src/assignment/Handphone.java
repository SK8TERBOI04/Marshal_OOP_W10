package assignment;

public class Handphone extends Barang {

    private String warna;

    public Handphone(String id, String nama, int harga, int stok, String warna) {
        super(id, nama, harga, stok);
        this.warna = warna;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Warna : " + warna);
    }
}
