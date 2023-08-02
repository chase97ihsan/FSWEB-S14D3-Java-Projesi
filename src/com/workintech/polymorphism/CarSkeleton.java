package com.workintech.polymorphism;

import javax.crypto.spec.PSource;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println("Class name: "+getClass().getSimpleName());
        return getName()+ " starting engine";
    }
    public  String drive(){
        runEngine(this);
        return  getName()+ " is driving";

    }

    protected void runEngine(CarSkeleton carSkeleton){
      if(carSkeleton instanceof GasPoweredCar){
       System.out.println("The car engine is starting with gas");
}     else if (carSkeleton instanceof  HybridCar) {
       System.out.println("The car engine is starting as hybrid");
}     else if (carSkeleton instanceof ElectricCar) {

       System.out.println("The car engine is starting with electric"+
               "(Battery size: "+ ((ElectricCar)carSkeleton).getBatterySize()+")");
}      else {
          System.out.println("there is no such a car that works");
    }
    }
}
