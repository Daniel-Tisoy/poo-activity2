package dtisoy.ejercicio3;

/**
 *
 * @author dtisoy
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Car myCar = new Car(
                "Ford",
                2024,
                5000,
                Car.fuelType.GASOLINE,
                Car.carType.EXECUTIVE,
                2,
                4,
                250,
                Car.Color.BLACK
        );
        // testing car methods
        myCar.speedUp(100);
        myCar.slowDown(30);

        separator();
        myCar.showInfo();
        separator();

        myCar.speedUp(200);

        myCar.brake();

        separator();
        myCar.showInfo();

        // getting ticket
        myCar.speedUp(203);
        // after getting a ticket the current speed should be 160
        double stimatedTime = myCar.calculateArrivalTime(500);

        separator();
        System.out.println("Arrival Time when moving 500 km is " + stimatedTime + " hours.");

        // testing getters and setters:
        separator();
        System.out.println("Tickets");
        System.out.println(myCar.getTicketList());

        // changin car info:
        myCar.setBrand("Ferrari");
        myCar.setEngine(3);
        myCar.setFuel(Car.fuelType.BIOETHANOL);

        separator();
        myCar.showInfo();
        separator();
        System.out.println("Current speed: " + myCar.getCurrentSpeed());

        //negative speed
        myCar.slowDown(300);

    }

    private static void separator() {
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
    }
}
