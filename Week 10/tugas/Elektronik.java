/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author ASUS
 */
public class Elektronik implements Pembayaran {
    private static final double PAJAK_ELEKTRONIK = 0.10; // 10%

    @Override
    public double hitungPajak(double harga) {
        return harga * PAJAK_ELEKTRONIK;
    }
    
    
}
