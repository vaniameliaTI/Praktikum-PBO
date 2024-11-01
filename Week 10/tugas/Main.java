/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaElektronik = 100000; // contoh harga elektronik
        double hargaMakanan = 50000; // contoh harga makanan

        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        System.out.println("Pajak Elektronik (harga " + hargaElektronik + "): " + pajakElektronik);
        System.out.println("Pajak Makanan (harga " + hargaMakanan + "): " + pajakMakanan);
    }
}
