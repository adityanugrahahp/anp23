/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.*;

/**
 *
 * @author user
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
//        String[] a = {"kazuya", "jin", "lee"};
//        String[] b = {"kazuya", "feng"};
        String[] a = {"lee", "jin"};
        String[] b = {"kazuya", "panda"};


        String[] res = rslt(a, b);
        System.out.println(Arrays.toString(res));

    }

    public static String[] rslt(String[] a, String[] b) {
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(a));

        set.addAll(Arrays.asList(b));

        String[] com = set.toArray(String[]::new);

        return com;
    }
}
