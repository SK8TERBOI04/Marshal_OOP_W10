package assignment;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Order order = new Order();
        int pilih = -1;

        while (pilih != 0) {

            System.out.println("-----------Menu Toko Voucher & HP-----------");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Input Barang Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            pilih = in.nextInt();

            // MENU 1
            if (pilih == 1) {
                System.out.print("Voucher / Handphone (V/H): ");
                char jenis = in.next().toLowerCase().charAt(0);

                if (jenis == 'h') {
                    Barang b = new Handphone("HP01", "Samsung Note 9", 13000000, 10, "Hitam");
                    order.tambahBarang(b);
                    System.out.println("Handphone telah berhasil diinput\n");

                } else if (jenis == 'v') {
                    Barang b = new Voucher("VC01", "Google Play", 20000, 100, 0.1);
                    order.tambahBarang(b);
                    System.out.println("Voucher telah berhasil diinput\n");

                } else {
                    System.out.println("Input salah!\n");
                }
            }

            // MENU 2
            else if (pilih == 2) {
                order.tampilPesanan();
                System.out.println();
            }

            // MENU 3
            else if (pilih == 3) {
                System.out.print("Voucher / Handphone (V/H): ");
                char jenis = in.next().toLowerCase().charAt(0);

                if (jenis == 'h') {
                    Handphone hp = new Handphone("HP02", "Samsung Note 9", 13000000, 10, "Hitam");

                    // Upcasting wajib
                    Barang b = hp;

                    order.tambahBarang(b);
                    System.out.println("Handphone telah berhasil diinput\n");

                } else if (jenis == 'v') {
                    Voucher vc = new Voucher("VC02", "Google Play", 20000, 100, 0.1);

                    Barang b = vc;

                    order.tambahBarang(b);
                    System.out.println("Voucher telah berhasil diinput\n");

                } else {
                    System.out.println("Input salah!\n");
                }
            }

            else if (pilih == 0) {
                System.out.println("Program selesai.");
            }

            else {
                System.out.println("Pilihan tidak valid!\n");
            }
        }

        in.close();
    }
}
