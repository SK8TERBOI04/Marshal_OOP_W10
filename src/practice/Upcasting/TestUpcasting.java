package practice.Upcasting;

public class TestUpcasting {
    public static void main(String[] args) {

        Pekerja p1 = new CEO();
        Pekerja p2 = new Karyawan();

        p1.tanyaIdentitas();
        p2.tanyaIdentitas();
    }
}
