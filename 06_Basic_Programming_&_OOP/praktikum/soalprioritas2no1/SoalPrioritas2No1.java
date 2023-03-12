/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalprioritas2no1;

/**
 *
 * @author user
 */
public class SoalPrioritas2No1 {

    /**
     * @param n
     */
        public static void drawXYZ(int n) {
            String x = "X";
            String y = "Y";
            String z = "Z";

            // TODO: complete this code
            int count = 1;
            for (int i = 1; i <= n; i++) {
                System.out.println();
                for (int j = 1; j <= n; j++) {

                    if (count % 3 == 0) {
                        System.out.print(x + " ");
                    } else if (count % 2 == 0) {
                        System.out.print(z + " ");
                    } else {
                        System.out.print(y + " ");
                    }
                    count++;
                }
            }
        }

        public static void main(String[] args) {
            drawXYZ(5);
        }
    }
