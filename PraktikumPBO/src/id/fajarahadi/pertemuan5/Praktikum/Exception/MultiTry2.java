package id.fajarahadi.pertemuan5.Praktikum.Exception;

public class MultiTry2 {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {//eksekusi berurutan
            System.out.println(array[5]);//1
            array[4] = 30 / 0;//2

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Panjang kurang dari 5!!");
        } catch (ArithmeticException e) {
            System.out.println("Tidak boleh dibagi 0!");
        }

    }
}
