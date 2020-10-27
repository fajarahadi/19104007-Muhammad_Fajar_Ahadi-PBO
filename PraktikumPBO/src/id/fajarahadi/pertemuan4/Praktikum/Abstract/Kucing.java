package id.fajarahadi.pertemuan4.Praktikum.Abstract;

public class Kucing extends Binatang {
    private String nama;

    public Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println(" Meonggg");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
