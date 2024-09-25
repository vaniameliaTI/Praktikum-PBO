/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        kucing Kucing = new kucing();
        Kucing.bersuara();
        Kucing.makan("ikan");
        Kucing.makan("ikan", 2);
        
        System.out.println(" ");
        
        anjing Anjing = new anjing();
        Anjing.bersuara();
        Anjing.makan("daging", 3);
        
    }
}
