package com.driver;

public class Main {
    public static void main(String[] args) {
        // F1 Car Test
        F1 mercedes = new F1("Mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        // Boat Test
        Boat titanic = new Boat("Titanic", 100);
        System.out.println("Boat Name: " + titanic.getVehicleName());
        System.out.println("Boat Capacity: " + titanic.getVehicleCapacity());
    }
}
