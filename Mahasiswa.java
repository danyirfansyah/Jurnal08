import java.util.HashMap;
import java.util.Map;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private double nilai;

    public Mahasiswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public double getNilai() {
        return nilai;
    }

    public String getNim() {
        return nim;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
