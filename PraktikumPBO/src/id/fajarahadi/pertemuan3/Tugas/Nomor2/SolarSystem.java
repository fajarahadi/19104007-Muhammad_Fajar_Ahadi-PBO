package id.fajarahadi.pertemuan3.Tugas.Nomor2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private String id;
    private String nama;
    private List<Planet> planetList = new ArrayList<>();

    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getTotalMember() {
        return getPlanets().size();
    }

    public List<Planet> getPlanets() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void getData() {
        System.out.println("\nID Solar System       : " + getId());
        System.out.println("Nama Solar System     : " + getNama());
        System.out.println("Total Member          : " + getTotalMember());
        System.out.println();
        for (Planet planet : planetList) {
            System.out.println("\n- ID Planet       : " + planet.getIdPlanet());
            System.out.println("- Urutan Planet   : " + planet.getUrutanPlanet());
            System.out.println("- Nama Planet     : " + planet.getNamaPlanet());
        }
    }


}
