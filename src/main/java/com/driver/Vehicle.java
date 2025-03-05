package com.driver;

public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Move method called - Speed: " + currentSpeed + ", Direction: " + currentDirection + " degrees");
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("Stop method called - The vehicle is stopped");
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getName() {
        return name;
    }
}
