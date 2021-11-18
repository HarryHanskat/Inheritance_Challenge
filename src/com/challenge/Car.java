package com.challenge;

public class Car extends Vehicle {
    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int gears, int wheels, int doors, boolean isManual) {
        super(name, size);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Gear Changed to " + currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity: Velocity " + " direction  " + direction );
        move(speed, direction);
    }
}
