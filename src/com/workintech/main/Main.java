package com.workintech.main;

import com.workintech.polymorphism.*;

public class Main {


    public static void workWithData() {
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();
        Car holden=new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
        Car ford=new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
        Car mitsubishi=new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        System.out.println(mitsubishi.isEngine());
        System.out.println(mitsubishi.getWheels());

        Car ford1=new Ford(6, "Ford Falcon");
        Car ford2=new Ford(6, "Ford Falcon");
        System.out.println(ford1.equals(ford2));
        Car mitsubishi1=new Mitsubishi(4, "Outlander VRX 4WD");
        Car mitsubishi2=new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi1.equals(mitsubishi2));

        System.out.println("------------------------------------");

        CarSkeleton car1=new ElectricCar("TESLA","Tesla aracıdır.",150,75);
        car1.startEngine();
        car1.drive();






    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        workWithData();

    }
}