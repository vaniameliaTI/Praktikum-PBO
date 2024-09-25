/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktiku6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(new Buku("Buku Pemrograman", 50000));
        keranjang.tambahProduk(new Elektronik("Laptop", 1500000));
        keranjang.tambahProduk(new Pakaian("Kaos", 100000));

        // Menghitung total harga setelah diskon
        double totalHargaSebelumDiskon = keranjang.hitungTotalHargaSebelumDiskon();
        
        double totalHargaSetelahDiskon = keranjang.hitungTotalHargaSetelahDiskon();
        
        System.out.println("Total harga sebelum diskon: Rp " + totalHargaSebelumDiskon);
        System.out.println("Total harga setelah diskon: Rp " + totalHargaSetelahDiskon);
    }
}
