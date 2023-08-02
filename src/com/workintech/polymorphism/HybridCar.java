package com.workintech.polymorphism;

import com.workintech.CarSkeleton.CarSkeleton;

public class HybridCar extends CarSkeleton {

    public double avgKmPerLitre;
    public  int batterySize;
    public  int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
