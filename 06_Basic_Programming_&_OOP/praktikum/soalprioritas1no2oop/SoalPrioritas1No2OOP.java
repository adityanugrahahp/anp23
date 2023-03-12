/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalprioritas1no2oop;

/**
 *
 * @author user
 */
public class SoalPrioritas1No2OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tambah = add(3, 4);
        int kurang = subtract(15, 4);
        int kali = multiply(10, 10);
        int bagi = divide(12, 3);

        System.out.println("Penjumlahan: " + tambah);
        System.out.println("Pengurangan: " + kurang);
        System.out.println("Perkalian: " + kali);
        System.out.println("Pembagian: " + bagi);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
