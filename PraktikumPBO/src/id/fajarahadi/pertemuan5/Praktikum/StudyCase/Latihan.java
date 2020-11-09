package id.fajarahadi.pertemuan5.Praktikum.StudyCase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        System.out.print("Input Array Length\t: ");
        int[] array = new int[intInputMethod()];

        System.out.println("Masukkan data\t: ");
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print("Indeks ke-" + i + "\t: ");
                array[i] = intInputMethod();
            } catch (InputMismatchException e) {
                System.out.println("Masukkan angka!!!");
                i--;
            }
        }
        System.out.println("\nOutput\t: ");
        for (int x : array) {
            System.out.println("Data\t: " + x);
        }
        //Pas nyoba waktu praktikum
        /*System.out.println("Masukkan data\t: ");
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Indeks ke-" + i + "\t: ");
                array[i] = intInputMethod();}
            System.out.println("\nOutput\t: ");
            for (int x : array) {
                System.out.println("Data\t: " + x);
            }
        } catch (InputMismatchException e) {
            System.out.println("Masukkan Angka!!");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Indeks ke-" + i + "\t: ");
                array[i] = intInputMethod();
            }
            System.out.println("\nOutput\t: ");
            for (int x : array) {
                System.out.println("Data\t: " + x);
            }
        }*/
    }

    public static int intInputMethod() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
