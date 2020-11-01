package id.fajarahadi.pertemuan3.Tugas.Nomor3;

import java.util.ArrayList;

public class Keluarga {

    private ArrayList<Anak> anakList = new ArrayList<>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;


    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }


    public String getNamaKeluarga() {

        return namaKeluarga;
    }

    public String getKotaAsal() {

        return kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, ArrayList<Anak> anakList) {
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anakList;
    }

    public ArrayList<Anak> getAnakList() {

        return anakList;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public void getDataKeluarga() {

        System.out.println("\nNama Keluarga   : " + getNamaKeluarga());
        System.out.println("Kota Asal       : " + getKotaAsal());

        System.out.println("\nID Ayah         : " + getAyah().getIdAyah());
        System.out.println("Nama Ayah       : " + getAyah().getNamaAyah());
        System.out.println("Umur Ayah       : " + getAyah().getUmurAyah() + " Tahun");

        System.out.println("\nID Ibu          : " + getIbu().getIdIbu());
        System.out.println("Nama Ibu        : " + getIbu().getNamaIbu());
        System.out.println("Umur Ibu        : " + getIbu().getUmurIbu() + " Tahun");

        System.out.println("Jumlah Anak     : " + getAnakList().size());
        System.out.println();
        for (Anak anak : anakList) {
            System.out.println("\nID Anak         : " + anak.getIdAnak());
            System.out.println("Nama Anak       : " + anak.getNamaAnak());
            System.out.println("Umur Anak       : " + anak.getUmurAnak() + " Tahun");
            System.out.println("Status Anak     : " + anak.getStatusAnak());

        }
    }
}
