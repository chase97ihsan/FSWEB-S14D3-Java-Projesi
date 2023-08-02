package com.workintech.polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    public void startEngine(){
        System.out.println(getClass().getSimpleName()+" the car's engine is starting");
    }
    public void accelerate(){
        System.out.println(getClass().getSimpleName()+" the car is accelerating");
    }
    public void brake(){
        System.out.println(getClass().getSimpleName()+" the car is braking");
    }
    @Override
    public boolean equals(Object obj) {
        return ((Holden)obj).getName()==getName()&&((Holden)obj).getCylinders()==getCylinders();
    }
}
