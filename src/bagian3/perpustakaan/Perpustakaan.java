package bagian3.perpustakaan;

import java.util.ArrayList;

/**
 * Class untuk mengelola koleksi buku di perpustakaan.
 */
public class Perpustakaan {

    // ArrayList yang menampung objek bertipe Buku
    private ArrayList<Buku> koleksi = new ArrayList<>();

    // Menambah satu buku ke koleksi
    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    // Menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Mencari buku berdasarkan judul, lalu menandainya dipinjam
    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // Tugas 1: Mengubah status buku menjadi tidak dipinjam (tersedia kembali)
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    b.setDipinjam(false);
                    System.out.println(judul + " berhasil dikembalikan.");
                } else {
                    System.out.println(judul + " memang belum dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // Tugas 3: Menampilkan semua buku karya penulis tertentu
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Penulis: " + penulis + " ==");
        boolean ditemukan = false;
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada koleksi buku dari penulis tersebut.");
        }
    }

    // Menghitung jumlah buku yang masih tersedia
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}