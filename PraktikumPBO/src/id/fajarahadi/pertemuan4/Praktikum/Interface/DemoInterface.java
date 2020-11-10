package id.fajarahadi.pertemuan4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket paketA = new Paket("PBO", "Fajarahadi", 100000, "4gb", 50000);

        paketA.hitungHargaPaket();
        paketA.cetakPaket();
    }
}
