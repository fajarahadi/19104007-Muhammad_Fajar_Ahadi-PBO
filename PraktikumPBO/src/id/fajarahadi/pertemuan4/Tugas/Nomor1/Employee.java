package id.fajarahadi.pertemuan4.Tugas.Nomor1;

public abstract class Employee {
    protected String nama;
    protected String nip;
    protected Float upah;
    protected Float komisi;
    protected Float totalPenjualan;
    protected Float totalProyek;

    Employee(String nama, String nip, float upah, float komisi, float totalPenjualan, float totalProyek) {
        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
        this.totalProyek = totalProyek;
    }

    public abstract void getGaji();
}
