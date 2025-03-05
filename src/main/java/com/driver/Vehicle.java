package com.driver;

public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentDirection = 0; // Default direction is 0
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println(name + " is moving at speed " + speed + " in direction " + direction);
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println(name + " changed direction to " + direction);
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println(name + " has stopped.");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
