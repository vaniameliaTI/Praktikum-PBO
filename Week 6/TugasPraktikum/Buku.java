/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktiku6;

/**
 *
 * @author ASUS
 */
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);   
    }
    public double hitungDiskon() {
        return harga * 0.90;
    }
}
