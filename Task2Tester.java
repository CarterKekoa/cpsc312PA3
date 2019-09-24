/**
 * This program sets up all the car objects and then runs the functions created in the other
 *      programs to output nicely
 *
 * CPSC 312-01, Fall 2019
 * Programming Assignment #3
 * No sources to cite.
 *
 * @author Carter Mooring
 * @version v1.0 8/28/19
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2Tester {
    public static void main(String[] args){
        Car car1 = new Car("Acura", "MDX", 2019, 7);
        Car car2 = new Car("Audi", "R8", 2020, 4078);
        Car car3 = new Car("Bentley", "Flying Spur", 2020, 1999);
        Car car4 = new Car("BMW", "I8", 2019, 45667);
        Car car5 = new Car("Jaguar", "F-Type", 2018, 68798);
        Car car6 = new Car("Maserati", "GranTurismo", 2018, 104567);
        Car car7 = new Car("Mercedes-Benz", "G-Class", 2017, 5678);
        Car car8 = new Car("Porsche", "911", 2016, 59998);
        Car car9 = new Car("Porsche", "911", 2016, 59999);
        Car car10 = new Car("De Dio-Bouton", "Quadricycle", 1891, 349999);

        Car[] cars = new Car[10];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;
        cars[5] = car6;
        cars[6] = car7;
        cars[7] = car8;
        cars[8] = car9;
        cars[9] = car10;

        System.out.println("----------UN-SORTED-----------");
        System.out.println(Arrays.toString(cars));
        System.out.println("\n" + "----------SORTED----------");
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        System.out.println("\n" + "----------DRIVEN----------");

        car2.drive(77777);
        car8.drive(2);
        car6.drive(312);
        car10.drive(2);

        System.out.println(Arrays.toString(cars));


    }
}
