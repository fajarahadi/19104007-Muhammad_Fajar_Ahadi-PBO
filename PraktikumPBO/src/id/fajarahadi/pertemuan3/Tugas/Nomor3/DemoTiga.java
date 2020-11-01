package id.fajarahadi.pertemuan3.Tugas.Nomor3;

import java.util.ArrayList;

public class DemoTiga {
    public static void main(String[] args) {

        Keluarga keluarga = new Keluarga("Cemara", "Semanggi");

        ArrayList<Anak> anakList = new ArrayList<>();

        keluarga.addAnggotaKeluarga(new Ayah(10203040, "Sape'i", 66),
                new Ibu(10203041, "Maemunah", 56),
                anakList);

        anakList.add(new Anak(10203042, "Ipin", 16, "Anak Kandung"));
        anakList.add(new Anak(10203043, "Upin", 16, "Anak Kandung"));

        keluarga.getDataKeluarga();
    }
}
