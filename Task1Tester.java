/**
 * This program computes the employees details using the information
 * given and the methods written in the child classes.
 *
 * CPSC 312-01, Fall 2019
 * Programming Assignment #3
 * No sources to cite.
 *
 * @author Carter Mooring
 * @version v1.0 8/28/19
 */

public class Task1Tester {
    public static void main(String[] args) {
        double basePay = 50000.00;

        driver(basePay);
    }

    //driver function that keeps clutter out of main and runs all the other programs nicely
    public static void driver(double basePay){
        Programmers[] myProgrammers = new Programmers[2];
        myProgrammers[0] = new Programmers("Carter Mooring", basePay, false);
        myProgrammers[1] = new Programmers("Ima Nerd", basePay, true);

        for (int i = 0; i < myProgrammers.length; i++) {
            myProgrammers[i].toString();
        }

        Lawyers[] myLawyers = new Lawyers[3];
        myLawyers[0] = new Lawyers("Kenny Dewitt", basePay, 10);
        myLawyers[1] = new Lawyers("Dan D. Lyon", basePay, 0);
        myLawyers[2] = new Lawyers("Willie Makit", basePay, 100);

        for (int j = 0; j < myLawyers.length; j++) {
            myLawyers[j].toString();
        }

        Accountants[] myAccountants = new Accountants[3];
        myAccountants[0] = new Accountants("Hal E. Luya", basePay, 17.00);
        myAccountants[1] = new Accountants("Midas Well", basePay, 45.50);
        myAccountants[2] = new Accountants("Doll R. Bill", basePay, 2.50);

        for (int k = 0; k < myAccountants.length; k++) {
            myAccountants[k].toString();
        }
    }
}
