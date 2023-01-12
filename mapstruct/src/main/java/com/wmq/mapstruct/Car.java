package com.wmq.mapstruct;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/12
 * @description:
 */
public class Car {
    private String make;
    private int numberOfSeats;

    public Car() {
    }

    public Car(String make, int numberOfSeats) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
