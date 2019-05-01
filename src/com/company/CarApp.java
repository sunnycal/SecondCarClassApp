package com.company;

//if you want to print out value (sys.out) you have to set it first

public class CarApp {
    //main method
    public static void main(String[] args) {
        //this is how you create an instance of the car class
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setColor("red");
        car2.setColor("blue");

        car1.setMake("Porsche");
        car2.setMake("Jetta");

        System.out.println(car1.isStarting());
        System.out.println(car2.isStarting());

        System.out.println(car1.isAccelerating());
        System.out.println(car2.isAccelerating());

        System.out.println(car2.isStopped());
        System.out.println(car2.isPasses());

        System.out.println(car1.isMph());
        System.out.println(car1.isNotMoving());

        //
// now run methods toghether in a strng and create a space
//        System.out.println("The " + car2.isJustPassed() + " just passed the " + car1.isJustPassed()
        System.out.println(car2.isJustPassed() + car1.getColor() +  " " + car1.getMake());




//        System.out.println(car1.getStarting());
//        System.out.println(car2.getStarting());
//
//        System.out.println(car1.getAccelerating());
//        System.out.println(car2.getAccelerating());
//
//        System.out.println(car2.getStopped());
//        System.out.println(car2. getPasses());
//
//        System.out.println(car1.getMph());
//        System.out.println(car2.getPasses());


    }
}
