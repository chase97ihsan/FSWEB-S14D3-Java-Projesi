package com.workintech.polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine=true;
        wheels=4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println(" the car's engine is starting");
    }
    public void accelerate(){
        System.out.println(" the car is accelerating");
    }
    public void brake(){
        System.out.println(" the car is braking");
    }

    @Override
    public String toString() {
        return getName()+"is ready to go!";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
