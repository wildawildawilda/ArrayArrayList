/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author weixi
 */
public class Mahasiswa {

    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk inisialisasi objek Mahasiswa
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk mengambil data atribut
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method untuk mengecek kelulusan (nilai >= 60)
    public boolean lulus() {
        return this.nilai >= 60;
    }
}
