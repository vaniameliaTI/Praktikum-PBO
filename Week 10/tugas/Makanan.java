/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author ASUS
 */
public class Makanan implements Pembayaran{
    private static final double PAJAK_MAKANAN = 0.05; // 5%

    @Override
    public double hitungPajak(double harga) {
        return harga * PAJAK_MAKANAN;
    }
    
}
