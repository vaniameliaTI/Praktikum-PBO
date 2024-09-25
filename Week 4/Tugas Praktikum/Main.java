/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Vania", 21, "Programmer", 100000000);
        
        System.out.println(pekerja.toString());
        
        pekerja.setNama("Vania Amelia");
        
        System.out.println(pekerja.toString());
    }
}
