package id.fajarahadi.pertemuan2.Tugas.Nomor2;

public class DemoBinatang {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.getNama("Burung Merpati");
        burung.Makan("Jagung");
        burung.Tidur("Pohon");
        burung.Keistimewaan("Terbang");

        Ikan ikan = new Ikan();
        ikan.getNama("Ikan Hiu");
        ikan.Makan("Ikan kecil");
        ikan.Tidur("Air");
        ikan.Keistimewaan("Berenang");

        Kucing kucing = new Kucing();
        kucing.getNama("Kucing Persia");
        kucing.Makan("ikan");
        kucing.Tidur("Kasur");
        kucing.Keistimewaan("Suaranya Meongg");
    }
}
