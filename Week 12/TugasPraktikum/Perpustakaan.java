/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Perpustakaan {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static final List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan Objek Buku ke File (Serialisasi)");
            System.out.println("3. Tampilkan Daftar Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileSerial();
                case 3 -> tampilkanBuku();
                case 4 -> {
                    System.out.println("Keluar dari sistem perpustakaan.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang buku: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        Buku buku = new Buku(judul, pengarang, tahunTerbit);
        bukuList.add(buku);
        System.out.println("Buku berhasil ditambahkan!");

        // Simpan ke file teks
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE, true))) {
            writer.write(buku.toString());
            writer.newLine();
            System.out.println("Buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks: " + e.getMessage());
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            out.writeObject(bukuList);
            System.out.println("Daftar buku berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial: " + e.getMessage());
        }
    }

    private static void tampilkanBuku() {
        System.out.println("\nDaftar Buku dari File Teks:");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file teks: " + e.getMessage());
        }

        System.out.println("\nDaftar Buku dari File Serial:");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> bukuDariSerial = (List<Buku>) in.readObject();
            for (Buku buku : bukuDariSerial) {
                System.out.println(buku);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca file serial: " + e.getMessage());
        }
    }
}
