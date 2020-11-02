package id.fajarahadi.pertemuan3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("2110", "Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", 21104001);
        Mahasiswa mahasiswa2 = new Mahasiswa("Fajar", 21104002);
        Mahasiswa mahasiswa3 = new Mahasiswa("Ahadi", 21104003);

        //List Mahasiswa dari Class Demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Fischl", 21104004));

        //untuk copas data dari list mahasiswa class "demoJurusan" ke class "Jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        //untuk masukan data Mahasiswa langsung ke class Jurusan
        jurusan.addMahasiswa(mahasiswa3);

        jurusan.printDataJurusan();
    }
}
