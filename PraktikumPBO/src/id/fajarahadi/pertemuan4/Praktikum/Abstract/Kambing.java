package id.fajarahadi.pertemuan4.Praktikum.Abstract;

public class Kambing extends Binatang {
    private String nama;

    public Kambing(String nama) {
        super("Kambing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println(" mbeeee");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
