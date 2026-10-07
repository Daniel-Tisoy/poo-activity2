/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package dtisoy.ejercicio2;

import dtisoy.ejercicio2.Planet.planetType;

/**
 *
 * @author dtisoy
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // three examples, not user input implementation done.
        
        Planet earth = new Planet("Earth", 1, 5.9736E24, 1.08321E12, 12742, 150000000, planetType.ROCKY, 1, 1, true);

        double earthDensity = earth.calculateDensity();

        System.out.println("EARTH");
        System.out.println("Planet density: " + earthDensity);
        System.out.println("Is an outer planet: " + earth.isOuterPlanet());
        System.out.println();
        earth.showInfo();
        System.out.println();

        // saturn
        Planet saturn = new Planet("Saturn", 146, 5.6834E26, 8.2713E14, 120536, 1433500000.0, planetType.GASS_GIANT, 29.46, 0.444, true);

        double saturnDensity = saturn.calculateDensity();

        System.out.println("SATURN");
        System.out.println("Planet density: " + saturnDensity);
        System.out.println("Is an outer planet: " + saturn.isOuterPlanet());
        System.out.println();
        saturn.showInfo();
        System.out.println();

        // mercury
        Planet mercury = new Planet("Mercury", 0, 3.3011E23, 6.083E10, 4879.4, 57910000.0, planetType.ROCKY, 0.24, 58.6, true);
        double mercuryDensity = mercury.calculateDensity();

        System.out.println("Mercury");
        System.out.println("Planet density: " + mercuryDensity);
        System.out.println("Is an outer planet: " + mercury.isOuterPlanet());
        System.out.println();
        mercury.showInfo();
        System.out.println();

    }
}
