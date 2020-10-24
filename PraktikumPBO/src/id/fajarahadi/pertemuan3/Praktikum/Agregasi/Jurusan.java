package id.fajarahadi.pertemuan3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    public void printDataJurusan() {
        System.out.println("Nama Jurusan\t: " + getNamaJurusan());
        System.out.println("Kode Jurusan\t: " + getKodeJurusan());
        System.out.println("List Mahasiswa\t: ");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println("- Nama : " + mahasiswa.getNama() +
                    "\t- Nim : " + mahasiswa.getNim());
        }
    }
}
