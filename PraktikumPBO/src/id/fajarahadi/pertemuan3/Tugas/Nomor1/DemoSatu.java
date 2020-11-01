package id.fajarahadi.pertemuan3.Tugas.Nomor1;

public class DemoSatu {
    public static void main(String[] args) {

        Komplek komplek1 = new Komplek("6666", "Taman Bunga");
        Komplek komplek2 = new Komplek("7777", "Taman Binatang");

        Rumah rumah1k1 = new Rumah("A201", "Mawar", 3);
        Rumah rumah2k1 = new Rumah("A202", "Melati", 2);
        Rumah rumah3k1 = new Rumah("A203", "Anggrek", 4);
        Rumah rumah4k1 = new Rumah("A204", "Benalu", 10);

        Rumah rumah1k2 = new Rumah("B201", "Kucing", 2);
        Rumah rumah2k2 = new Rumah("B203", "Burung", 3);
        Rumah rumah3k2 = new Rumah("B204", "Ayam", 6);


        komplek1.addRumah(rumah1k1.getIdRumah());
        komplek1.addRumah(rumah2k1.getIdRumah());
        komplek1.addRumah(rumah3k1.getIdRumah());
        komplek1.addRumah(rumah4k1.getIdRumah());

        komplek1.getDataKompek();

        komplek2.addRumah(rumah1k2.getIdRumah());
        komplek2.addRumah(rumah2k2.getIdRumah());
        komplek2.addRumah(rumah3k2.getIdRumah());

        komplek2.getDataKompek();

    }
}
