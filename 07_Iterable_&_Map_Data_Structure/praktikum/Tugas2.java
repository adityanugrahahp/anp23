/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

import java.util.*;

/**
 *
 * @author user
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Integer> outputArr = new ArrayList<>();

        System.out.print("");
        String input = in.nextLine();
        for (int i = 0; i < input.length(); i++) {
            intArr.add(Integer.parseInt(input.substring(i, i + 1)));
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer key : intArr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
            } else {
                outputArr.add(key);
            }
        }

        Collections.sort(outputArr, Collections.reverseOrder());
        System.out.println(outputArr);
    }
}
