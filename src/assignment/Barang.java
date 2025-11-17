package assignment;

public class Barang {
    protected String id;
    protected String nama;
    protected int harga;
    protected int stok;

    public Barang() {}

    public Barang(String id, String nama, int harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }

    public String getId() {
        return id;
    }
}
