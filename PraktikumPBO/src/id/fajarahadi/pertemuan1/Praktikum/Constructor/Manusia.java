package id.fajarahadi.pertemuan1.Praktikum.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    //Constructor Pertama
    public Manusia(){}

    //Constructor Kedua
    public Manusia(String nama){
        this.nama = nama;
    }

    //Constructor Ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Getter & Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
