package id.fajarahadi.pertemuan4.Praktikum.Abstract;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] peliharaan = {
                new Burung("Merpati"),
                new Kambing("Bandot"),
                new Kucing("Anggora"),
                new Anjing("Pudel")
        };

        Binatang kesayangan;

        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("Binatang kesayangan anda\t: " + kesayangan);
        System.out.print("Suaranya\t\t: ");
        kesayangan.suara();
    }
}
