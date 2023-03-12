/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalprioritas1no2;

/**
 *
 * @author user
 */
public class SoalPrioritas1No2 {

    public static void main(String[] args) {
        int hb1 = 15000;
        int hj1 = 30000;
        int hsl1 = hj1 - hb1;

        // TODO: cek apakah hsl penjualan mengalami keuntungan / kerugian
        if (hj1 > hb1) {
            System.out.println("untung sebesar : " + hsl1);
        } else if (hj1 < hb1) {
            System.out.println("rugi Sebesar : " + hsl1);
        } else {
            System.out.println("sama Saja");
        }

        int hb2 = 12000;
        int hj2 = 9000;
        int hsl2 = hj2 - hb2;

        if (hj2 > hb2) {
            System.out.println("untung sebesar : " + hsl2);
        } else if (hj2 < hb2) {
            System.out.println("rugi Sebesar : " + hsl2);
        } else {
            System.out.println("sama Saja");
        }

        int hb3 = 12000;
        int hj3 = 12000;
        int hsl3 = hj3 - hb3;

        if (hj3 > hb3) {
            System.out.println("untung sebesar : " + hsl3);
        } else if (hj3 < hb3) {
            System.out.println("rugi Sebesar : " + hsl3);
        } else {
            System.out.println("sama Saja");
        }

    }
}
