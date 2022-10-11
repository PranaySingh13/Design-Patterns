package com.gk.designPatterns.creational.abstractFactory;

abstract public class Loan {
    protected double interestRate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
            /*
              to calculate the monthly loan payment i.e. EMI
              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              so, n=years*12;
            */
        double EMI;
        int n;
        n = years * 12;
        interestRate = interestRate / (12 * 100);
        EMI = ((interestRate * Math.pow((1 + interestRate), n)) / ((Math.pow((1 + interestRate), n)) - 1)) * loanAmount;
        System.out.println("Your monthly EMI is " + EMI + " for the loan amount " + loanAmount + " you have borrowed");
    }
}
