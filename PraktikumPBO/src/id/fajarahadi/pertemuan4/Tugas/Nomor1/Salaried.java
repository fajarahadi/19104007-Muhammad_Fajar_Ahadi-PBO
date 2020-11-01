package id.fajarahadi.pertemuan4.Tugas.Nomor1;

public class Salaried extends Employee {

    public Salaried(String nama, String nip, float upah, float komisi, float totalPenjualan, float totalProyek) {
        super(nama, nip, upah, (float) 0, (float) 0, (float) 0);
    }

    @Override
    public void getGaji() {
        System.out.println("Total Gaji  " + this.nama + " : Rp " + this.upah);
    }

}
