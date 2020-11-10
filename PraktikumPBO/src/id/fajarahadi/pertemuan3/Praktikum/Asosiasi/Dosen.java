package id.fajarahadi.pertemuan3.Praktikum.Asosiasi;

public class Dosen {
    private String kodeDosen;
    private int nimMHS[] = new int[10];
    private int jumlahMahasiswa;

    public Dosen() {
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public int getNimMHS(int indeks) {
        return (nimMHS[indeks]);
    }

    public void setNimMHS(int nim) {
        nimMHS[jumlahMahasiswa] = nim;
        jumlahMahasiswa++;
    }
}
