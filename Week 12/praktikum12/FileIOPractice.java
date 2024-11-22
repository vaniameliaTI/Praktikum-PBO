/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author ASUS
 */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args){
        String filePath = "data.txt";
        
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Belajar File I/O di Java!\n");
            writer.write("Pemograman Berorientasi Objek!\n");
            
            System.out.println("Data berhasil ditulis ke file: " +filePath);
        }  catch (IOException e) {
                 System.out.println("Terjadi kesalahan saat menulis file.");  
            e.printStackTrace();
        }  
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.println("\nIsi file: ");
            while ((character = reader.read()) != -1){
                System.out.print((char) character);                
            }    
        }  catch (IOException e) {
            System.out.println("terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}
