import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    String nama;
    int harga;
    int stok;

    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampil() {
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok  : " + stok);
        System.out.println("----------------------");
    }
}

public class Main {
    static ArrayList<Barang> listBarang = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Edit Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    tampilBarang();
                    break;
                case 3:
                    editBarang();
                    break;
                case 4:
                    hapusBarang();
                    break;
            }

        } while (pilihan != 5);
    }

    static void tambahBarang() {
        System.out.print("Nama Barang: ");
        String nama = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();

        System.out.print("Stok: ");
        int stok = input.nextInt();

        listBarang.add(new Barang(nama, harga, stok));
        System.out.println("✔ Barang berhasil ditambahkan!");
    }

    static void tampilBarang() {
        if (listBarang.isEmpty()) {
            System.out.println("Data kosong!");
        } else {
            for (int i = 0; i < listBarang.size(); i++) {
                System.out.println("Index: " + i);
                listBarang.get(i).tampil();
            }
        }
    }

    static void editBarang() {
        tampilBarang();
        System.out.print("Pilih index yang mau diedit: ");
        int index = input.nextInt();
        input.nextLine();

        if (index >= 0 && index < listBarang.size()) {
            System.out.print("Nama baru: ");
            listBarang.get(index).nama = input.nextLine();

            System.out.print("Harga baru: ");
            listBarang.get(index).harga = input.nextInt();

            System.out.print("Stok baru: ");
            listBarang.get(index).stok = input.nextInt();

            System.out.println("✔ Data berhasil diupdate!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    static void hapusBarang() {
        tampilBarang();
        System.out.print("Pilih index yang mau dihapus: ");
        int index = input.nextInt();

        if (index >= 0 && index < listBarang.size()) {
            listBarang.remove(index);
            System.out.println("✔ Data berhasil dihapus!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
}