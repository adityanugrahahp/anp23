/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalprioritas1no1oop;

/**
 *
 * @author user
 */
public class Product {

    String nama;
    String deskripsi;
    int harga;
    int jumlahstok;

    public Product(String nama, String deskripsi, int harga, int jumlahstok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlahstok = jumlahstok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlahstok() {
        return jumlahstok;
    }

    public void setJumlahstok(int jumlahstok) {
        this.jumlahstok = jumlahstok;
    }

    public void getInfo() {
        System.out.print("===");
        System.out.println("");
        System.out.println("INFO PRODUK");
        System.out.println("nama: " + nama);
        System.out.println("deskripsi: " + deskripsi);
        System.out.println("harga: " + harga);
        System.out.println("jumlah stok: " + jumlahstok);
        System.out.print("===");
        System.out.println("");
    }
}