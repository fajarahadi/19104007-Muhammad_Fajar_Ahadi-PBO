package id.fajarahadi.pertemuan4.Tugas.Nomor1;

public abstract class Employee {
    protected String nama;
    protected String nip;
    protected Float upah;
    protected Float komisi;
    protected Float total_penjualan;
    protected Float total_proyek;

    Employee(String nama, String nip, float upah, float komisi, float total_penjualan, float total_proyek) {
        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
        this.komisi = komisi;
        this.total_penjualan = total_penjualan;
        this.total_proyek = total_proyek;
    }

    public abstract void getGaji();
}
