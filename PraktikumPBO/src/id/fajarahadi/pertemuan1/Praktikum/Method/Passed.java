package id.fajarahadi.pertemuan1.Praktikum.Method;

public class Passed {
    public static void main(String[] args) {
        int nomor1, nomor2;
        TestPass pass = new TestPass(50, 100);//Deklarasi object
        nomor1 = 10;
        nomor2 = 20;

        System.out.println("Nilai sebelum passed by value : ");
        System.out.println("nomor1 = " + nomor1);
        System.out.println("nomor2 = " + nomor2);

        //Passed by value
        pass.calculate(nomor1, nomor2);
        System.out.println("Nilai sesudah passed by value : ");
        System.out.println("nomor1 = " + nomor1);
        System.out.println("nomor2 = " + nomor2);

        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by value : ");
        System.out.println("pass.nomor1 = " + pass.nomor1);
        System.out.println("pass.nomor2 = " + pass.nomor2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by value : ");
        System.out.println("pass.nomor1 = " + pass.nomor1);
        System.out.println("pass.nomor2 = " + pass.nomor2);
    }
}
