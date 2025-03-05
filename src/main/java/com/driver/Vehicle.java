package com.driver;

public class Vehicle {
    private String name;
    private int wheels;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println(name + " moving at speed " + speed + " in direction " + direction);
    }

    public void changeSpeed(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println(name + " changed speed to " + speed + " in direction " + direction);
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println(name + " has stopped.");
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println(name + " steering at " + direction + " degrees");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
