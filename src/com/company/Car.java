package com.company;

public class Car {

        //Construct the car object and initialize the car information
        String Color;
        Double Fuel;
        Double Odometer;
        Double Efficiency;

        public Car(String c, double f, double o, double e) {

            Color = c;
            Fuel = f;
            Odometer = o;
            Efficiency = e;
        }

        //Drive a given time and speed, update the fuel level and odometer values
        int Time;
        Double Speed;
        Double distanceCalc;

        public void driveData(int t, double s) {

            Time = t;
            Speed = s;
            distanceCalc = t * s;

            Odometer = Odometer + distanceCalc;
            Fuel = Fuel - distanceCalc / Efficiency;
        }


        //Drive a given distance, update the fuel level and odometer values
        Double Distance;

        public void driveDistance(double x) {

            Distance = x;

            Fuel = Fuel - Distance / Efficiency;
            Odometer = Odometer + Distance;

        }

        //Display status, output fuel level and odometer
        public void show() {

            int odometerValue = Odometer.intValue();
            int mpg = Efficiency.intValue();

            System.out.println("----------------");
            System.out.println("Color: " + Color);
            System.out.println("Fuel: " + Fuel + " gallons");
            System.out.println("Odometer: " + odometerValue + " miles");
            System.out.println("Efficiency: " + mpg + " m/h");
            System.out.println("----------------");

        }
    }