/**
 * This program specifies information needed for all Employees in the company, also the parent class
 * CPSC 312-01, Fall 2019
 * Programming Assignment #3
 * No sources to cite.
 *
 * @author Carter Mooring
 * @version v1.0 9/23/19
 */

public class Employee {
    private String name;
    private double salary;

    //EVC
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //gets the Name of employees if needed
    public String getName(){
        return name;
    }

    //sets the Name of employees if needed
    public void setName(String name){
        this.name = name;
    }

    //gets the salary value if needed
    public double getSalary(){
        return salary;
    }

    //sets the salary value if needed
    public void setSalary(double salary){
        this.salary = salary;
    }

    ///prints the Employees information
    @Override
    public String toString(){
        return name + " and I earn a salary of $";
    }
}
