public class Main {
    public static void main(String[] args) {
        Mapping mhs = new Mapping();

        // Menambahkan mahasiswa
        mhs.tambahMahasiswa("12345", "Dany Irfansyah", "A");
        mhs.tambahMahasiswa("54321", "Oline Manuel Chay", "B");

        // Menyimpan nilai mahasiswa
        mhs.simpanNilai("12345", 85);
        mhs.simpanNilai("54321", 90);

        // Menampilkan nilai mahasiswa dan rata-rata
        mhs.tampilkanNilaiDanRataRata();

        // Menghapus mahasiswa
        mhs.hapusMahasiswa("12345");

        // Menampilkan nilai mahasiswa dan rata-rata setelah menghapus satu mahasiswa
        mhs.tampilkanNilaiDanRataRata();
    }
}