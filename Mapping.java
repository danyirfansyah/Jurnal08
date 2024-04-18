import java.util.HashMap;
import java.util.Map;

public class Mapping {
    private Map<String, Mahasiswa> mahasiswaMap;

    public Mapping() {
        mahasiswaMap = new HashMap<>();
    }

    public void tambahMahasiswa(String nim, String nama, String kelas) {
        Mahasiswa mahasiswa = new Mahasiswa(nama, kelas);
        mahasiswaMap.put(nim, mahasiswa);
    }

    public void hapusMahasiswa(String nim) {
        mahasiswaMap.remove(nim);
    }

    public void simpanNilai(String nim, double nilai) {
        if (mahasiswaMap.containsKey(nim)) {
            Mahasiswa mahasiswa = mahasiswaMap.get(nim);
            mahasiswa.setNilai(nilai);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void tampilkanNilaiDanRataRata() {
        double totalNilai = 0;
        int jumlahMahasiswa = 0;
    
        for (Mahasiswa mahasiswa : mahasiswaMap.values()) {
            if (mahasiswa.getNilai() != 0) {
                totalNilai += mahasiswa.getNilai();
                jumlahMahasiswa++;
                System.out.println("NIM: " + getKeyByValue(mahasiswaMap, mahasiswa) + ", Nama: " + mahasiswa.getNama() + ", Kelas: " + mahasiswa.getKelas() + ", Nilai: " + mahasiswa.getNilai());
            }
        }
    
        if (jumlahMahasiswa > 0) {
            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("Rata-rata Nilai: " + rataRata);
        } else {
            System.out.println("Belum ada nilai yang disimpan.");
        }
    }
    
    // Metode untuk mendapatkan kunci (NIM) berdasarkan nilai (objek Mahasiswa)
    private String getKeyByValue(Map<String, Mahasiswa> map, Mahasiswa value) {
        for (Map.Entry<String, Mahasiswa> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
}