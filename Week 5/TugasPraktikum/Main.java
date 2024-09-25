/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama  = "Mika";
        kucing.jenis = "Kucing";
        kucing.suara = "meow";
        kucing.jumlahkaki = 4;
        kucing.Info();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Nopal";
        anjing.jenis = "Anjing";
        anjing.suara = "guk guk";
        anjing.jumlahkaki = 4;
        anjing.Info();
        
        System.out.println();
    }
}
