package com.driver;

public class F1 extends Car {
    public F1(String name, int currentSpeed) {
        super(name, currentSpeed, 4, 2, false, "Petrol", 5);
    }

    public void accelerate(int speed) {
        int newSpeed = getCurrentSpeed() + speed;
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        move(newSpeed, getCurrentDirection());
    }
}
