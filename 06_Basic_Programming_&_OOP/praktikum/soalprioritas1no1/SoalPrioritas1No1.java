/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalprioritas1no1;

/**
 *
 * @author user
 */
public class SoalPrioritas1No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // segitiga
        float alas = 20;
        float tinggi = 25;

        // TODO: hitung luas segitiga
        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.printf("%.0f",luasSegitiga);

        // persegi panjang
        float panjang = 40;
        float lebar = 6;

        //TODO: hitung luas persegi panjang
        float luasPersegiPanjang = panjang * lebar;
        System.out.printf("\n%.0f",luasPersegiPanjang);
        
        // lingkaran
        double jari2 = 7;
        double phi = 3.14;

        //TODO: hitung luas lingkaran
        double luasLingkaran = phi * jari2 * jari2;
        System.out.printf("\n%.2f",luasLingkaran);
        System.out.println("");
    }
}
