package id.fajarahadi.pertemuan2.Tugas.Nomor2;

public class Ikan extends Binatang {
    @Override
    public void Makan(String makan) {
        super.Makan(makan);
        System.out.println("" + makan);
    }

    @Override
    public void Tidur(String tidur) {
        super.Tidur(tidur);
        System.out.println("" + tidur);
    }

    public void getNama(String nama) {
        System.out.println("\nNama hewan       : " + nama);
    }

    public void Keistimewaan(String keistimewaan) {
        System.out.println("Keistimewaan     : " + keistimewaan);
    }
}
