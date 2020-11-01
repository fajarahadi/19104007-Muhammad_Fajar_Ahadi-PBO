package id.fajarahadi.pertemuan4.Tugas.Nomor1;

import java.util.Random;

public class DemoSatu {
    public static void main(String[] args) {
        Employee[] employee = {
                new Commision("Muhammad", "1029384756", 3000000, 500000, 10, 3),
                new Salaried("Fajar", "1029384755", 3500000, 650000, 20, 8),
                new ProjectPlanner("Ahadi", "1029384754", 4000000, 700000, 15, 4)};

        Random pilihan = new Random();
        Employee pegawai = employee[pilihan.nextInt(employee.length)];

        System.out.println("Gaji Pegawai");
        pegawai.getGaji();
    }
}
