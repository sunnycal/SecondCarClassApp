package com.company;


public class Car {

    //when I print out I will have a getter not a setter
    //setter is to set the value


    //private member variables
    private String color;
    private String make;
    private String starting;
    private String accelerating;
    private String stopping;
    private String mph;

    //default constructor
    public Car() {
    }

    //overloaded constructor
    public Car(String color, String make, String starting, String accelerating, String stopping, String mph) {
        this.color = color;
        this.make = make;
        this.starting = starting;
        this.accelerating = accelerating;
        this.stopping = stopping;
        this.mph = mph;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getStarting() {
        return "The " + getColor() + " " + getMake() + " is starting.";
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public String getAccelerating() {
        return "The " + getColor() + " " + getMake() + " is accelerating.";
    }

    public void setAccelerating(String accelerating) {
        this.accelerating = accelerating;
    }

    public String getStopping() {
        return stopping;
    }

    public void setStopping(String stopping) {
        this.stopping = stopping;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }


}
