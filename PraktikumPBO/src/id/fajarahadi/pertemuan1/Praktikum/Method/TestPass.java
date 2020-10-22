package id.fajarahadi.pertemuan1.Praktikum.Method;

public class TestPass {
    int nomor1;
    int nomor2;

    //constructor
    public TestPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //Pass by value, parameter berupa tipe data primitif
    public void calculate(int m, int n){
        m = m * 10;
        n = n / 2;
    }

    //Pass by Reference, parameter berupa tipe data class
    public void calculate(TestPass pass){
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 / 2;
    }
}
