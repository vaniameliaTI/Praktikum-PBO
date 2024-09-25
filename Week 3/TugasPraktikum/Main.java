/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil MobilnyaVania = new Mobil("Honda", "Jazz", "Putih", 2019);
        Mobil MobilnyaFebri = new Mobil("BMW", "cooper","Merah", 2023);
        
        System.out.println("Informasi Mobil Vania"); 
        MobilnyaVania.info();
        
        System.out.println("Informasi Mobil Febri"); 
        MobilnyaFebri.info();
        
        // Mengubah nilai atribut menggunakan Setter
        MobilnyaVania.setMerk("Honda");
        MobilnyaVania.setModel("HRV");
        MobilnyaVania.setWarna("Army");
        MobilnyaVania.setTahun(2023);
        
        System.out.println("Informasi Mobil Vania setelah perubahan: "); 
        MobilnyaVania.info();
       
        System.out.println("Memulai mesin:");
        MobilnyaVania.startEngine();
        MobilnyaFebri.startEngine();
    }
}

