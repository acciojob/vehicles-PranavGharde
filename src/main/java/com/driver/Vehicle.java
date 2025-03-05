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
    }

    public void changeSpeed(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void stop() {
        this.currentSpeed = 0;
    }

    public void turn(int direction) {
        this.currentDirection += direction;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
