package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Red", 30, 50000, 25);

        car.driveData(5, 70);
        car.driveDistance(300);

        car.show();


    }
}
