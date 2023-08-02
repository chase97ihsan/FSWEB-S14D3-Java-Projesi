package com.workintech.polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
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
        return ((Ford)obj).getName()==getName()&&((Ford)obj).getCylinders()==getCylinders();
    }

}
