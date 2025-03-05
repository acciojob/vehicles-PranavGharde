package com.driver;

public class Main {
    public static void main(String[] args) {
        // F1 Car Test
        F1 mercedes = new F1("Mercedes", 0);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        mercedes.stop();

        System.out.println();

        // Boat Test
        Boat yacht = new Boat("Luxury Yacht", 10);
        System.out.println("Boat Name: " + yacht.getVehicleName());
        System.out.println("Boat Capacity: " + yacht.getVehicleCapacity());
    }
}
