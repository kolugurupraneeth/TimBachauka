package com.inHerit;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;// to determine the current speed
    private int currentDirection;// to determine the current direction of the car

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection=0;
        this.currentVelocity=0;
    }


    public void steer(int direction){
        this.currentDirection+=direction;
        this.currentVelocity+=direction;
        System.out.println("vehicle.steer"+currentDirection+ "degrees");


    }

    public void move(int velocity, int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("vehicle.move moving at "+currentVelocity+"in direction"+currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity=0;
    }
}

