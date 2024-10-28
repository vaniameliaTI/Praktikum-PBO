/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikumpbo9;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing ();
        Hewan anjing = new Anjing ();
        System.out.println("");
        kucing.suara ();
        kucing.info ();
        System.out.println("");
        anjing.suara();
        anjing.info();
    }
}
