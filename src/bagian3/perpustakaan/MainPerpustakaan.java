package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // Membuat objek Buku lalu memasukkannya ke koleksi (dengan tahun terbit asli versi Inggris)
        perpus.tambahBuku(new Buku("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        perpus.tambahBuku(new Buku("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998));
        perpus.tambahBuku(new Buku("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999));
        perpus.tambahBuku(new Buku("Harry Potter and the Goblet of Fire", "J.K. Rowling", 2000)); // Tambahan untuk tes cariPenulis
        
        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Pengujian fitur Pinjam Buku
        perpus.pinjamBuku("Harry Potter and the Philosopher's Stone");
        perpus.pinjamBuku("Harry Potter and the Philosopher's Stone"); // coba pinjam kedua kali
        System.out.println();
        
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Pengujian Tugas 1: Kembalikan Buku
        System.out.println("== Pengujian Kembalikan Buku ==");
        perpus.kembalikanBuku("Harry Potter and the Philosopher's Stone");
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia setelah dikembalikan: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Pengujian Tugas 3: Cari Penulis
        perpus.cariPenulis("J.K. Rowling");
        System.out.println();
        perpus.cariPenulis("Agatha Christie"); // Tes jika penulis tidak ditemukan
    }
}