/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventorySystem {
    private static final String TEXT_FILE = "produk.txt";
    private static final String SERIAL_FILE = "produk.ser";
    private static final List<Produk> produkList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Keluar");
            System.out.println("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahProduk(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanProduk();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahProduk(Scanner scanner) {
        System.out.println("Masukkan nama produk:");
        String nama = scanner.nextLine();
        System.out.println("Masukkan harga produk:");
        double harga = scanner.nextDouble();
        System.out.println("Masukkan stok produk:");
        int stok = scanner.nextInt();
        scanner.nextLine();

        Produk produk = new Produk(nama, harga, stok);
        produkList.add(produk);
        System.out.println("Produk berhasil ditambahkan!");
    }

    private static void simpanKeFileTeks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE))) {
            for (Produk produk : produkList) {
                writer.write(produk.toString());
                writer.newLine();
            }
            System.out.println("Produk berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks: " + e.getMessage());
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            out.writeObject(produkList);
            System.out.println("Produk berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial: " + e.getMessage());
        }
    }

    private static void tampilkanProduk() {
        if (produkList.isEmpty()) {
            System.out.println("Tidak ada produk dalam daftar.");
        } else {
            for (Produk produk : produkList) {
                produk.tampilkanInfo();
            }
        }
    }
}