package id.fajarahadi.pertemuan4.Tugas.Nomor1;

public class Commision extends Employee {

    public Commision(String nama, String nip, float upah, float komisi, float total_penjualan, float total_proyek) {
        super(nama, nip, upah, komisi, total_penjualan, total_proyek);
    }


    @Override
    public void getGaji() {
        float gaji = this.upah + (this.komisi * this.total_penjualan);
        System.out.println("Total Gaji " + this.nama + " : Rp " + gaji);
    }
}
