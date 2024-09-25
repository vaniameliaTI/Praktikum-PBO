/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktiku6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList; 
import java.util.List;      

class KeranjangBelanja {
    private List<Produk> daftarProduk; 
    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>(); 
    }
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
    public double hitungTotalHargaSebelumDiskon(){
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.getHarga();
        }
        return total;
    }
    public double hitungTotalHargaSetelahDiskon() {
        double total = 0; 
        for (Produk produk : daftarProduk) {
            total += produk.hitungDiskon(); 
        }
        return total; 
    }
    
    
}
    