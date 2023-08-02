package com.workintech.polymorphism;

public class GasPoweredCar extends CarSkeleton {

    public double avgKmPerLitre;
    public  int  cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}
