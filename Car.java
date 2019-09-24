/**
 * This program implements other functions and sets up the cars object to be used and added to later
 *
 * CPSC 312-01, Fall 2019
 * Programming Assignment #3
 * No sources to cite.
 *
 * @author Carter Mooring
 * @version v1.0 8/28/19
 */

public class Car implements Driveable, Comparable<Car>{
    private String make;
    private String model;
    private int year;
    private int odometerReading;

    //DVC
    public Car(){
        make = "";
        model = "";
        year = -1;
        odometerReading = -1;
    }

    //EVC
    public Car(String make, String model, int year, int odometerReading){
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometerReading = odometerReading;
    }

    //gets the make of car if needed
    public String getMake() {
        return make;
    }

    //sets the make of car if needed
    public void setMake(String make) {
        this.make = make;
    }

    //gets the model of car if needed
    public String getModel() {
        return model;
    }

    //sets the model of car if needed
    public void setModel(String model){
        this.model = model;
    }

    //gets the year of car if needed
    public int getYear(){
        return year;
    }

    //sets the year of car if needed
    public void setYear(int year){
        this.year = year;
    }

    //gets the odometer of car if needed
    public int getOdometerReading(){
        return odometerReading;
    }

    //sets the odometer of car if needed
    public void setOdometerReading(int odometerReading){
        this.odometerReading = odometerReading;
    }


    //This prints the car info in a nice way
    @Override
    public String toString(){
        return year + " " + make + " " + model + " with " + odometerReading + " miles  \n";
    }

    //This compares the cars various information to another car object to sort
    @Override
    public int compareTo(Car o){
        if(this.year < o.year){
            return -1;
        } else if(this.year > o.year){
            return 1;
        } else if (this.year == o.year){
            return this.make.compareTo(o.getMake());
        } else if(this.make == o.getMake()){
            return this.model.compareTo(o.getModel());
        } else if (this.model == o.model){
            if(this.odometerReading < o.odometerReading){
                return -1;
            } else if(this.odometerReading > o.odometerReading){
                return 1;
            }
        }
        return 0;
    }

    //this function is used when a car is drive to alter that cars odometer reading
    @Override
    public void drive(int milesDriven){
        odometerReading += milesDriven;
        if(odometerReading  >= 350000){
            System.out.printf("The " + make + " has " + odometerReading +  " miles driven and is out of order! \n");
        }
    }
}
