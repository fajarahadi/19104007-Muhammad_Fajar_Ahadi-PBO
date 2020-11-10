package id.fajarahadi.pertemuan2.Praktikum.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superClass = new A();
        B subClass = new B();

        System.out.println("Masukin data ke SuperClass");
        superClass.x = 10;
        superClass.y = 50;
        superClass.printXY();


        System.out.println("Masukin data ke SubClass");
        subClass.x = 30;
        subClass.y = 40;
        subClass.z = 10;
        subClass.printXY();
        subClass.sumValue();

    }
}
