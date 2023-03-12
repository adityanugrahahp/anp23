/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soaleksplorasino1;

/**
 *
 * @author user
 */
public class SoalEksplorasiNo1 {

    public static String encrypt(String s) {
        String eks = "";
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (Character.isAlphabetic(charAt)) {
                int enc = charAt + 10;
                if (Character.isLowerCase(charAt)) {
                    if (enc > 'z') {
                        enc -= 26;
                    }
                } else {
                    if (enc > 'Z') {
                        enc -= 26;
                    }
                }
                eks += (char) enc;
            } else {
                eks += charAt;
            }
        }
        return eks;
    }

public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}