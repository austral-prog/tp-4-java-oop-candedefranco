package com.template;

public class Elevator {
    int minFloor;
    int maxFloor;
    int maxPeople;
    int currentFloor;
    int passengerCount;

    //constructor
    public Elevator(int minFloor, int maxFloor, int maxPeople) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxPeople = maxPeople;
        this.currentFloor = 0;
        this.passengerCount = 0;
    }

    //getters
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    //setters
    public void moveToFloor(int newFloor) {
        if (minFloor <= newFloor & newFloor <= maxFloor) {
            currentFloor = newFloor;
        }
    }

    public void addPassenger() {
        if (passengerCount + 1 <= maxPeople) {
            passengerCount ++;
        }
    }

    public void removePassenger() {
        if (passengerCount - 1 >= 0) {
            passengerCount --;
        }
    }

    public static void main(String[] args) {

    }
    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}
