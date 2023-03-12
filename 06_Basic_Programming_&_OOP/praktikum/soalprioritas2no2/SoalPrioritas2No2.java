/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalprioritas2no2;

/**
 *
 * @author user
 */
public class SoalPrioritas2No2 {

    public static void printAsterisk(int n) {
        // TODO: complete this code
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                if (k != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printAsterisk(5);
    }
}
