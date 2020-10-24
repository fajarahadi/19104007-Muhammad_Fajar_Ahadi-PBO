package id.fajarahadi.pertemuan3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Fajar");
        mahasiswa1.setNim(21104001);

        Mahasiswa mahasiswa2 = new Mahasiswa(21104002, "Ahadi");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");
        dosen.setNimMHS(mahasiswa1.getNim());
        dosen.setNimMHS(mahasiswa2.getNim());

        System.out.println("Kode Dosen\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJumlahMahasiswa(); i++) {
            System.out.println("- " + dosen.getNimMHS(i));
        }
    }
}
