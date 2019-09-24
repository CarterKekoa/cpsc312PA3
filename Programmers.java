/**
 * This program specifies information needed for Programmers in the company
 * CPSC 312-01, Fall 2019
 * Programming Assignment #3
 * No sources to cite.
 *
 * @author Carter Mooring
 * @version v1.0 9/23/19
 */

public class Programmers extends Employee{
    private boolean busPass;

    //EVC
    public Programmers(String name, double salary, boolean busPass){
        super(name, salary);
        this.busPass = busPass;
    }

    //gets the Bus Pass value if needed
    public boolean getBusPass(){
        return busPass;
    }

    //sets the bus pass value if needed
    public void setBusPass(boolean busPass){
        this.busPass = busPass;
    }

    //organizes the Programmers info to print nicely combined with parent info
    public String reportSalary(){
        double extraPay = 20000.00 + super.getSalary();
        String passBus = "";
        String actualPay = String.format("%.2f", extraPay);

        if(busPass == false){
            passBus = "do not";
        }

        System.out.println("I am a Programmer named " + super.toString() + actualPay + ". I " +
                passBus + " get a bus pass.");

        return "I am a Programmer named " + super.toString() + actualPay + ". I " +
                passBus + " get a bus pass.";
    }

    //prints the Accountants information
    @Override
    public String toString(){
        return reportSalary();
    }

}
