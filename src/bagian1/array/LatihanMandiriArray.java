/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {
        
//1. Buat array berisi 6 suhu harian (bertipe double). Tampilkan suhu tertinggi dan
//terendah.
        double[] nilai = new double[6];
        nilai[0] = 40.6;
        nilai[1] = 14.5;
        nilai[2] = 23.0;
        nilai[3] = 33.5;
        nilai[4] = 32.7;
        nilai[5] = 44.4;
        
        double tinggi = nilai[1];
        double rendah = nilai[1];
        
        for (int i = 1; i < nilai.length; i++) {
            tinggi = Math.max(tinggi, nilai[i]);
            rendah = Math.min(rendah, nilai[i]);
        }
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Rendah : " + rendah);
        System.out.println();
        
//2. Buat array String berisi 5 nama hari. Cetak hanya nama hari yang memiliki
//lebih dari 5 huruf (gunakan .length() pada String).
        String[] nama = {"senin", "selasa", "kamis", "sabtu", "minggu"};
        for (int j = 0; j < nama.length; j++){
                if (nama[j].length() > 5){
                    System.out.println(nama[j]);
            }
        }
        System.out.println();
        
//3. Diberikan int[] angka = {4, 8, 15, 16, 23, 42}; hitung dan tampilkan berapa
//banyak angka genap di dalamnya.
        int[] angka = new int[6];
        int genap = 0;
        angka[0] = 4;
        angka[1] = 8;
        angka[2] = 15;
        angka[3] = 16;
        angka[4] = 23;
        angka[5] = 42;
        for (int k = 0; k < angka.length; k++){
            if (angka[k] % 2 == 0){
                genap++;
                System.out.println(angka[k]);
            }
        }
        System.out.println("Ada " + genap + " angka genap");
    }     
}
