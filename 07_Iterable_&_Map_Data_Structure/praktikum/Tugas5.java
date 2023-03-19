/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

/**
 *
 * @author user
 */
public class Tugas5 {

    /**
     * @param args the command line arguments
     */
    public static int del(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 3, 3, 6, 9, 9};
        int[] b = {2, 2, 2, 11};

        int x = del(a);
        int y = del(b);

        System.out.println("Input 1 : " + x);
        System.out.println("Input 2 : " + y);
    }
}
