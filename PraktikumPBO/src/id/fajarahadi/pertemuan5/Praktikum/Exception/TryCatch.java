package id.fajarahadi.pertemuan5.Praktikum.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        File file = new File("D:\\Fafa.txt");

        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Read file berhasil");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ada di laptop kesayangan anda!");
        }
    }
}
