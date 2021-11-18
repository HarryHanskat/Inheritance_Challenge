package com.challenge;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "SUV", 6, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(2);
        } else {
            changeGear(3);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
