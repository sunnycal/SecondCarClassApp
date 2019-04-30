package com.company;

//if you want to print out value (sys.out) you have to set it first

public class CarApp {
    public static void main(String[] args) {
        //this is how you create an instance of the car class
        Car car1 = new Car();

        car1.setColor("red");
        car1.setMake("Porsche");

        System.out.println(car1.getStarting());
        System.out.println(car1.getAccelerating());
    }
}
