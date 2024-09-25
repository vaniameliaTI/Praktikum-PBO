/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String merk;
    private String model;
    private String warna;
    private int tahun;
    
    public Mobil(String merk, String model, String warna, int tahun) {
       this.merk = merk;
       this.model = model;
       this.warna = warna;
       this.tahun = tahun;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("warna: " + warna );
    }
    public void startEngine() {
        System.out.println("Mesin mobil "+merk+" menyala");   
    }
}
