package com.careerdevs;

import org.w3c.dom.ls.LSOutput;

public class Car {
    private String make;
    private String model;
    private boolean isRented;

     public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.isRented = false;
    }
    // this method is to access the value of make (getter)
    public String getMake() {
        return make;
    }
    // this method is to access the value of model
    public String getModel() {
        return model;
    }

    public String getName(){
        return make + " " + model;
    }

    // this method is to access the value of isRented
    public void setRented(boolean rented) {
        isRented = rented;
    }

    public boolean isRented() {
        return isRented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
