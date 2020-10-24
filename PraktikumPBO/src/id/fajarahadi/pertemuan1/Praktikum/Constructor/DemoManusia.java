package id.fajarahadi.pertemuan1.Praktikum.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of object
        Manusia arrayMahasiswa [] = new Manusia[3];

        //constructor pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Fajar");
        manusia1.setUmur(19);

        //constructor kedua
        Manusia manusia2 = new Manusia("Ahadi");

        //constructor ketiga
        Manusia manusia3 = new Manusia("Fajarahadi", 19);

        arrayMahasiswa[0] = manusia1;
        arrayMahasiswa[1] = manusia2;
        arrayMahasiswa[2] = manusia3;

        for (Manusia X : arrayMahasiswa) {
            System.out.println("Character");
            System.out.println("Nama\t: "+ X.getNama());
            System.out.println("Umur\t: "+ X.getUmur());
            System.out.println();
        }
    }
}
