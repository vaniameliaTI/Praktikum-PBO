/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author ASUS
 */
public class MainApp {
    public static void main(String[] args){
        Buku buku1 = new Buku("Pemograman Java");
        Buku buku2 = new Buku("Struktur Data");
        
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();
        
        Anggota anggota1 = new Anggota("Vania");
        Anggota anggota2 = new Anggota ("Dewa");
        
        Klub klub = new Klub("Klub Pemograman");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        
        System.out.println("\nInformasi Klub:");
        klub.infoKlub(); 
    }
}
