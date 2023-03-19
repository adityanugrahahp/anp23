/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

import java.util.*;

/**
 *
 * @author user
 */
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

//        a.add(3);
//        a.add(8);
//        b.add(2);
//        b.add(8);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        b.add(1);
        b.add(3);
        b.add(5);
        b.add(10);
        b.add(16);

        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < b.size() - 1; j++) {
                if (a.get(i) == b.get(j)) {
                    a.remove(i);
                }
            }
        }

        System.out.println(a);
    }
}
