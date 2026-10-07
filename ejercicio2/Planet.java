
package dtisoy.ejercicio2;

/**
 *
 * @author ASUS
 */
public class Planet {

    enum planetType {
        ROCKY, GASS_GIANT, DWARF
    };

    planetType type;

    String name = null;
    int numberSatellites = 0;
    double mass = 0;
    double volume = 0;
    double diameter = 0;
    double sunDistance = 0;
    double orbitalPeriod = 0;
    double rotationPeriod = 0;
    boolean isObservable = false;

    Planet(String name, int numberSatellites, double mass, double volume, double diameter, double sunDistance, planetType type, double orbitalPeriod,
            double rotationPeriod, boolean isObservable) {
        this.name = name;
        this.numberSatellites = numberSatellites;
        this.mass = mass;
        this.volume = volume;
        this.sunDistance = sunDistance;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
        this.isObservable = isObservable;
        this.diameter = diameter;
        this.type = type;
    }

    public void showInfo() {
        System.out.println("Planet Name: " + this.name);
        System.out.println("Number of satellites: " + this.numberSatellites);
        System.out.println("Planet mass: " + this.mass);
        System.out.println("Planet volume: " + this.volume);
        System.out.println("Planet diameter: " + this.diameter);
        System.out.println("Planet sun distance: " + this.sunDistance);
        System.out.println("Planet type: " + this.type);
        System.out.println("Is observable: " + this.isObservable);
        System.out.println("Planet rotation period: " + this.rotationPeriod + " days");
        System.out.println("Planet orbital Period: " + this.orbitalPeriod + " years");

    }

    public double calculateDensity() {
        return this.mass / this.volume;
    }

    public boolean isOuterPlanet() {
        // planets beyond the asteroid belt
        double limit = 149597870 * 3.4;

        if (this.sunDistance > limit) {
            return true;
        } else {
            return false;
        }
    }
}
