/**
 * This program specifies information needed for Lawyers in the company
 * CPSC 312-01, Fall 2019
 * Programming Assignment #3
 * No sources to cite.
 *
 * @author Carter Mooring
 * @version v1.0 9/23/19
 */
public class Lawyers extends Employee {
    private int stockOptions;

    //EVC
    public Lawyers(String name, double salary, int stockOptions){
        super(name, salary);
        this.stockOptions = stockOptions;
    }

    //gets the stock options value if needed
    public int getStockOptions(){
        return stockOptions;
    }

    //sets the stock options value if needed
    public void setStockOptions(int stockOptions){
        this.stockOptions = stockOptions;
    }

    //organizes the Lawyers info to print nicely combined with parent info
    public String reportSalary(){
        double extraPay = 30000.00 + super.getSalary();
        String actualPay = String.format("%.2f", extraPay);

        System.out.println("I am a Lawyer named " + super.toString() + actualPay + ". I get a " + stockOptions +
                " share signing bonus.");

        return "I am a Lawyer named " + super.toString() + actualPay + ". I get a " + stockOptions +
                " share signing bonus.";
    }

    //prints the Accountants information
    public String toString(){
        return reportSalary();
    }
}
