package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0; // Default speed is 0
        this.currentDirection = 0; // Default direction is 0 (straight)
    }

    public void steer(int direction) {
        // Add the given direction to current direction
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + this.currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        // Set the values of currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + this.currentSpeed + ", and the direction is changed to: " + this.currentDirection + " degrees");
    }

    public void stop() {
        // Set speed to 0 when stopping
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    // Getter methods for accessing private fields in subclasses
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public String getName() {
        return name;
    }
}
