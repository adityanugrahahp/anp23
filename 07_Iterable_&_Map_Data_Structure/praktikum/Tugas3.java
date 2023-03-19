/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

import java.util.*;

/**
 *
 * @author user
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int intArr[] = {1, 2, 3, 4, 6};
        int intArr[] = {2, 5, 9, 11};

        System.out.print("Target = ");
        int x = in.nextInt();

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                int sum = intArr[i] + intArr[j];
                if (sum == x) {
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
            }
        }
    }
}
