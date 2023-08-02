package com.workintech.polymorphism;

import com.workintech.CarSkeleton.CarSkeleton;

public class ElectricCar extends CarSkeleton {

    public double avgKmPerCharge;
    public  int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
