package com.morrisje.java;

public class Vehicle {
    private int  body;
    private String engine;
    private String transmission;
    private int wheels;
    private int rims;

    public Vehicle(int body, String engine, String transmission, int wheels, int rims) {
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.rims = rims;
    }
    public void move(int speed){

    }

    public int getBody() {
        return body;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getWheels() {
        return wheels;
    }

    public int getRims() {
        return rims;
    }
}
