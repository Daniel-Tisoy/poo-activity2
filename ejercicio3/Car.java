package dtisoy.ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author dtisoy
 */
public class Car {

    String brand;
    int model;
    int engine;

    public enum fuelType {
        GASOLINE, BIOETHANOL, DIESEL, BIODIESEL, NATURAL_GAS
    }
    fuelType fuel;

    public enum carType {
        CITY, SUBCOMPACT, COMPACT, FAMILY, EXECUTIVE, SUV
    }
    carType category;
    int numDoors;
    int numSeat;
    int maxSpeed;

    enum Color {
        WHITE, BLACK, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET
    }
    Color color;
    int currentSpeed = 0;
    boolean isAutomatic;
    ArrayList<Integer> ticketList = new ArrayList<>();

    public Car(String brand, int model, int engine, fuelType fuel, carType category, int numDoors, int numSeat, int maxSpeed, Color color, boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.category = category;
        this.numDoors = numDoors;
        this.numSeat = numSeat;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

  

  

    public ArrayList<Integer> getTicketList() {
        return ticketList;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public fuelType getFuel() {
        return fuel;
    }

    public void setFuel(fuelType fuel) {
        this.fuel = fuel;
    }

    public carType getCategory() {
        return category;
    }

    public void setCategory(carType category) {
        this.category = category;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumSeat() {
        return numSeat;
    }

    public void setNumSeat(int numSeat) {
        this.numSeat = numSeat;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean getIsAutomatic() {
        return isAutomatic;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public int amountTickets() {
        return this.getTicketList().size();
    }

    public int debitTickets() {
        int sum = 0;
        for (int num : this.getTicketList()) {
            sum += num;
        }
        return sum;
    }

    public void speedUp(int speedIncrement) {
        int speedlimit = 200;
        int ticketValue = 160000;

        if (this.currentSpeed + speedIncrement < this.maxSpeed) {
            this.setCurrentSpeed(this.currentSpeed + speedIncrement);
            if (this.currentSpeed > speedlimit) {
                System.out.println("OOHH, you got a ticket by exeding the speed limit of " + speedlimit + " km/h");
                this.ticketList.add(ticketValue);
                this.currentSpeed = speedlimit;
            }
        } else {
            System.out.println("Cannot increase to a speed higher than the Car´s maximum speed.");
        }
    }

    public void slowDown(int speedDecrement) {
        int update = this.currentSpeed - speedDecrement;
        if (update >= 0) {
            this.setCurrentSpeed(update);

        } else {
            System.out.println("Cannot decrement to a negative speed.");
        }
    }

    public void brake() {
        this.setCurrentSpeed(0);
    }

    public double calculateArrivalTime(int distance) {
        return distance / this.getCurrentSpeed();
    }

    public void showInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Engine: " + this.engine);
        System.out.println("Fuel type: " + this.fuel);
        System.out.println("Car type: " + this.category);
        System.out.println("Number of doors: " + this.numDoors);
        System.out.println("Number of seats: " + this.numSeat);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Color: " + this.color);
        System.out.println("Is automatic: " + this.getIsAutomatic());
        System.out.println();
        System.out.println("TICKETS");
        System.out.println("debit: " + this.debitTickets());
        System.out.println("amount of tickets: " + this.amountTickets());
    }
}
