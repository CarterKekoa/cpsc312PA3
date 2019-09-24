/**
 * This program specifies information needed for Accountants in the company
 * CPSC 312-01, Fall 2019
 * Programming Assignment #3
 * No sources to cite.
 *
 * @author Carter Mooring
 * @version v1.0 9/23/19
 */

public class Accountants extends Employee{
    private double parkingAllowance;

    //EVC
    public Accountants(String name, double salary, double parkingAllowance){
        super(name, salary);
        this.parkingAllowance = parkingAllowance;
    }

    //gets the parking allowance value if needed
    public double getParkingAllowance(){
        return getParkingAllowance();
    }

    //sets the parking allowance value if needed
    public void setParkingAllowance(double parkingAllowance){
        this.parkingAllowance = parkingAllowance;
    }

    //organizes the Accountant info to print nicely combined with parent info
    public String reportSalary(){
        String actualPay = String.format("%.2f", super.getSalary());
        String allowance = String.format("%.2f", parkingAllowance);

        System.out.println("I am an Accountant named " + super.toString() + actualPay +
                ". I get a $" + allowance + " parking allowance.");

        return "I am an Accountant named " + super.toString() + actualPay +
                ". I get a $" + allowance + " parking allowance.";
    }

    //prints the Accountants information
    public String toString(){
        return reportSalary();
    }
}
