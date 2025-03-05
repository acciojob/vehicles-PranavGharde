package com.driver;

public class Car extends Vehicle {
    private int doors;
    private int gears;
    private boolean isManual;
    private String type;
    private int seats;
    private int currentGear;

    public Car(String name, int doors, int gears, boolean isManual, String type, int seats) {
        super(name, 4); // A car has 4 wheels
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Car changed to gear " + newGear);
    }

    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
        System.out.println("Speed changed to " + speed + " in direction " + direction);
    }
}
