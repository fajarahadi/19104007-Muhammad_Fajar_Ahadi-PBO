package id.fajarahadi.pertemuan2.Tugas.Nomor1;

public class Club {
    public String nama, stadion, deskripsi;
    public int tahunBerdiri, juaraUcl;

    //overloading dengan constructor kosong
    public Club() {
    }

    //overloading dengan constructor 1 parameter
    public Club(String nama) {
        this.nama = nama;
    }

    //overloading dengan constructor 2 parameter
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    //overloading dengan constructor 3 parameter
    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    //overloading dengan constructor 5 parameter
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        if (nama == null) {
            nama = "Belum di isi";
        }
        if (stadion == null) {
            stadion = "Belum di isi";
        }
        if (deskripsi == null) {
            deskripsi = "Belum di isi";
        }
        if (tahunBerdiri == 0) {
            tahunBerdiri = 0;
        }
        if (juaraUcl == 0) {
            juaraUcl = 0;
        }
        System.out.println("Nama          : " + nama);
        System.out.println("Juara         : " + juaraUcl);
        System.out.println("Deskripsi     : " + deskripsi);
        System.out.println("Tahun Berdiri : " + tahunBerdiri);
        System.out.println("Stadion       : " + stadion);
        System.out.println();
    }
}
