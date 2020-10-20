package id.fajarahadi.pertemuan2.Praktikum.Polimorfisme;

public class Y extends X {
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value Y : " + value);
    }
}
