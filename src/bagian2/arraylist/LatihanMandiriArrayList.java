/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;
import java.util.ArrayList;

public class LatihanMandiriArrayList {
       public static void main(String[] args) {
//1. Buat ArrayList<String> daftar belanja. Tambah 4 item, lalu hapus item ke-2,
//lalu tampilkan isi list beserta jumlah akhirnya
            ArrayList<String> daftar_belanja = new ArrayList<>();
            daftar_belanja.add("McDonalds");
            daftar_belanja.add("KFC");
            daftar_belanja.add("Burger King");
            daftar_belanja.add("Subway");
            
            System.out.println("Isi awal list   : " + daftar_belanja);
            
            // Menghapus item ke-2 (index ke-1, yaitu KFC)
            daftar_belanja.remove(1); 
            
            System.out.println("Isi akhir list  : " + daftar_belanja);
            System.out.println("Jumlah akhir    : " + daftar_belanja.size() + " item");
            System.out.println();
            
//2. Buat ArrayList<Integer> berisi 5 angka. Tampilkan nilai terbesar dengan
//menelusuri seluruh elemen. (Diibaratkan sebagai jumlah kalori atau harga)
            ArrayList<Integer> angka = new ArrayList<>();
            angka.add(450);
            angka.add(620);
            angka.add(890);
            angka.add(310);
            angka.add(550);
            
            int max = angka.get(0);
            for (int i = 0; i < angka.size(); i++) {
                int angkaNow = angka.get(i);
                if (angkaNow > max) {
                    max = angkaNow;
                }
            }
            System.out.println("Nilai kalori/harga maks: " + max);
            System.out.println();
            
//3. Buat program yang menambah 6 nama ke dalam ArrayList, lalu cetak hanya
//nama yang diawali huruf A (gunakan method startsWith pada String).            
            ArrayList<String> name = new ArrayList<>();
            name.add("A&W");
            name.add("Wendy's");
            name.add("Amigos");
            name.add("Pizza Hut");
            name.add("Ayam Sabana");
            name.add("Dominos");
            
            System.out.println("Fast Food yang diawali huruf 'A':");
            for (int i = 0; i < name.size(); i++){
                String nameShow = name.get(i);
                if (nameShow.startsWith("A")){
                    System.out.println("- " + nameShow);
                }
            }
    } 
}