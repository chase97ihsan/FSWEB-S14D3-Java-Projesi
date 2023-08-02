package com.workintech.polymorphism;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
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
        return ((Mitsubishi)obj).getName()==getName()&&((Mitsubishi)obj).getCylinders()==getCylinders();
    }
}
