/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author user
 */
public class Tugas6 {

    /**
     * @param args the command line arguments
     */
    public static int findMax(int[] nums, int k) {
        int sum = 0;
        int cur = 0;

        for (int i = 0; i < k; i++) {
            cur += nums[i];
        }

        sum = cur;

        for (int i = k; i < nums.length; i++) {
            cur += nums[i] - nums[i - k];
            sum = Math.max(sum, cur);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] intArr1 = {2, 1, 5, 1, 3, 2};
        int[] intArr2 = {2, 3, 4, 1, 5};

        int a = findMax(intArr1, 3);
        int b = findMax(intArr2, 2);

        System.out.println("Input 1 : " + a);
        System.out.println("Input 2 : " + b);
    }
}
