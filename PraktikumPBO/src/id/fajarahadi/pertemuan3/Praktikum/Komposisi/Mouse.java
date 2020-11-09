package id.fajarahadi.pertemuan3.Praktikum.Komposisi;

public class Mouse {
    private String merk;
    private String dpi;

    public Mouse(String merk, String dpi) {
        this.merk = merk;
        this.dpi = dpi;
    }

    public void PrintSpec() {
        System.out.println("- Merk\t: " + merk);
        System.out.println("- DPI\t: " + dpi);
        System.out.println();
    }
}
