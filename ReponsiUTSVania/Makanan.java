/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositoriUTSvania;

/**
 *
 * @author ASUS
 */
public class Makanan extends Produk {
     private String tanggalkadaluarsa;
    
    public Makanan (String namaProduk, int harga, String tanggalkadaluarsa){
        super (namaProduk, harga);
        this.tanggalkadaluarsa = tanggalkadaluarsa;    
    }
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalkadaluarsa );
    }
    
}
