package id.fajarahadi.pertemuan2.Praktikum.Polimorfisme;

public class Lagu {
    public String judul;
    public String pencipta;

    //Overloading
    public Lagu(String judul) {
        this.judul = judul;
    }

    //Overloading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu() {
        System.out.println("\nJudul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
    }
}
