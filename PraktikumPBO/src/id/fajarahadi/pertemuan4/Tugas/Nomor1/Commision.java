package id.fajarahadi.pertemuan4.Tugas.Nomor1;

public class Commision extends Employee {

    public Commision(String nama, String nip, float upah, float komisi, float totalPenjualan, float totalProyek) {
        super(nama, nip, upah, komisi, totalPenjualan, totalProyek);
    }


    @Override
    public void getGaji() {
        float gaji = this.upah + (this.komisi * this.totalPenjualan);
        System.out.println("Total Gaji " + this.nama + " : Rp " + gaji);
    }
}
