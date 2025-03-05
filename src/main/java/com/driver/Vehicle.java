package com.driver;

public class Vehicle {
    private String name;
    private int wheels;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void move(int speed, int direction) {
        System.out.println("Vehicle moving at speed " + speed + " in direction " + direction);
    }

    public void steer(int direction) {
        System.out.println("Vehicle steering at " + direction + " degrees");
    }
}
