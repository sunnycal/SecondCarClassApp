package com.company;


public class Car {

    //when I print out I will have a getter not a setter
    //setter is to set the value


    //private member variables
    private String color;
    private String make;
    private String starting;
    private String accelerating;
    private String stopped;
    private String mph;
    private String passes;
    private String passed;

    //in IntelliJ right click and select Generator, select none to create default constructor
    public Car() {
    }

    public Car(String color, String make, String starting, String accelerating, String stopped, String mph, String passes, String passed) {
        this.color = color;
        this.make = make;
        this.starting = starting;
        this.accelerating = accelerating;
        this.stopped = stopped;
        this.mph = mph;
        this.passes = passes;
        this.passed = passed;
    }

    //code must be between last curly brace


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
        return starting;
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public String getAccelerating() {
        return accelerating;
    }

    public void setAccelerating(String accelerating) {
        this.accelerating = accelerating;
    }

    public String getStopped() {
        return stopped;
    }

    public void setStopped(String stopped) {
        this.stopped = stopped;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public String getPasses() {
        return passes;
    }

    public void setPasses(String passes) {
        this.passes = passes;
    }

    public String getPassed() {
        return passed;
    }

    public void setPassed(String passed) {
        this.passed = passed;
    }

    //custom methods I created
    public String isStarting () {
        return "The " + getColor() + " " + getMake() + " is starting";
    }

    public String isAccelerating (){
    return "The " + getColor() + " " + getMake() + " is accelerating";
        }
    public String isStopped (){
     return "The " + getColor() + " " + getMake() + " has stopped to have its emissions checked";

    }
    public String isPasses (){
        return "The " + getColor() + " " + getMake() + " passes its emissions test";
    }
    public String isMph (){
        return "The " + getColor() + " " + getMake() + " is going 50 Mph";
    }
    public String isNotMoving () {
        return "The " + getColor() + " " + getMake() + " is stopped";
    }

//    public String isJustPassed () {
//        return  getColor() + " " + getMake()   ;
//    }

    public String isJustPassed () {
        return  "The " + getColor() + " " + getMake() + " just passed the "  ;
    }

} // end Car class
