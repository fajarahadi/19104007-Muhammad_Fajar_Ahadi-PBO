package id.fajarahadi.pertemuan3.Tugas.Nomor2;

import java.util.ArrayList;
import java.util.List;

public class DemoDua {
    public static void main(String[] args) {

        SolarSystem solarSystem = new SolarSystem("666", "Tata Surya");

        Planet planet1 = new Planet(1021, 1, "Merkurius");
        Planet planet2 = new Planet(1022, 2, "Venus");
        Planet planet3 = new Planet(1023, 3, "Bumi");
        Planet planet4 = new Planet(1024, 4, "Mars");
        Planet planet5 = new Planet(1025, 5, "Jupiter");
        Planet planet6 = new Planet(1026, 6, "Saturnus");
        Planet planet7 = new Planet(1027, 7, "Uranus");
        Planet planet8 = new Planet(1028, 8, "Neptunus");

        List<Planet> planetList = new ArrayList<>();

        planetList.add(planet1);
        planetList.add(planet2);
        planetList.add(planet3);
        planetList.add(planet4);
        planetList.add(planet5);
        planetList.add(planet6);
        planetList.add(planet7);
        planetList.add(planet8);

        solarSystem.setPlanetList(planetList);

        solarSystem.getData();
    }
}
