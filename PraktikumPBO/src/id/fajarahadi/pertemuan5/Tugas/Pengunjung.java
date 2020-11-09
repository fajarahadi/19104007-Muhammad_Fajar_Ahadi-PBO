package id.fajarahadi.pertemuan5.Tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pengunjung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int indeks;

        System.out.println("<--- Pelanggan --->");
        System.out.print("Jumlah Pengunjung\t: ");
        int pengunjung = scanner.nextInt();

        System.out.println("Masukkan Data Pengunjung\t: ");
        for (int i = 0; i < pengunjung; i++) {
            try {
                System.out.print("UID\t: ");
                array[i] = intInputMethod();
                System.out.println("Data ke-" + i + " : " + array[i] + " terdaftar!");
            } catch (InputMismatchException e) {
                System.out.println("Inputkan Angka!");
                i--;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Maaf kami hanya menyediakan 10 slot");
            }
        }
        try {
            System.out.println("\nLihat Data Pengunjung\t: ");
            System.out.print("Indeks\t: ");
            indeks = scanner.nextInt();
            System.out.println("Data ke-" + indeks + "\t: " + array[indeks]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks tidak ditemukan");
        }
        boolean ulang = false;
        do {
            System.out.print("Lihat Lagi? (y/n)\t: ");
            String pilihan = scanner.next();
            if (pilihan.equals("y") || pilihan.equals("Y")) {
                try {
                    System.out.print("Indeks\t: ");
                    indeks = scanner.nextInt();
                    System.out.println("Data ke-" + indeks + "\t: " + array[indeks]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Indeks tidak ditemukan");
                }
            } else {
                ulang = true;
            }
        } while (!ulang);

    }

    public static int intInputMethod() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
