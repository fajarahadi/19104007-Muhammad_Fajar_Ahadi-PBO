package id.fajarahadi.pertemuan5.Praktikum.Exception;

public class MultiTry1 {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            array[4] = 30 / 0;
            System.out.println(array[5]);


        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Panjang kurang dari 5!!");
            System.out.println("Tidak boleh dibagi 0!");
        }
    }
}
