/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalprioritas1no1oop;

/**
 *
 * @author user
 */
public class Main {

    public class SoalEksplorasiNo1OOP {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Product product = new Product("coffee", "this is coffee", 15000, 10);
            product.getInfo();

            product.setNama("milk");
            product.setDeskripsi("this is fresh milk");
            product.setHarga(25000);
            product.setJumlahstok(10);
            product.getInfo();
            
            product.setNama("apple juice");
            product.setDeskripsi("this is juice");
            product.setHarga(18000);
            product.setJumlahstok(20);    
            product.getInfo();
        }
    }
}
