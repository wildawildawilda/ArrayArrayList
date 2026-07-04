/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

// Nama : Wilda Yanti
// NPM  : 2410010569
public class MainTugas {

    public static void main(String[] args) {
        // 4. Menyimpan daftar nama mata kuliah dalam array String (minimal 3, ukuran tetap)
        String[] mataKuliah = {"Object-Oriented Programming", "Data Structures", "Database Systems"};

        // Menampilkan daftar mata kuliah
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // 3. Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambah minimal 5 objek Mahasiswa ke koleksi ()
        kelas.tambahMahasiswa(new Mahasiswa("Alistair", "2410010001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Beatrice", "2410010002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Callum", "2410010003", 72.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eleanor", "2410010004", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Arthur", "2410010005", 90.0));

        // Menampilkan seluruh data mahasiswa awal
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah data mahasiswa awal: " + kelas.getJumlahData());
        System.out.println();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("=== ANALISIS DATA ===");
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

        // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println("... Menambahkan 1 mahasiswa baru ...\n");
        kelas.tambahMahasiswa(new Mahasiswa("Duncan", "2410010006", 65.0));

        // Menampilkan kembali jumlah data terbaru beserta list-nya
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah data mahasiswa sekarang: " + kelas.getJumlahData());
    }
}