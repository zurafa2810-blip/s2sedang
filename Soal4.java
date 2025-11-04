/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal4;
import java.util.Scanner;

/**
 *
 * @author hamasawojajar
 */
public class Soal4 {
     static double tabung(double jari, double tinggi) {
         double Pi = 3.14;
    return Pi*jari*jari* tinggi;
    // kembalikan hasil 
}

    public static void main(String[] args) {
      Scanner inputan = new Scanner (System.in);
      
        System.out.println("Masukan jari-jari (cm):");
         double jari = inputan.nextDouble();
        
        System.out.println("Masukan Tinggi (cm):");
         double tinggi = inputan.nextDouble();
        
        double Hasil = tabung(jari,tinggi);
        
        System.out.println("Volume Tabung :"+Hasil);
        
    
    }
}
