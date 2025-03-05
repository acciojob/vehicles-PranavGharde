package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private boolean isConvertible;
    private String fuelType;
    private int mileage;

    public Car(String name, int currentSpeed, int wheels, int doors, boolean isConvertible, String fuelType, int mileage) {
        super(name, currentSpeed);
        this.wheels = wheels;
        this.doors = doors;
        this.isConvertible = isConvertible;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }
}
