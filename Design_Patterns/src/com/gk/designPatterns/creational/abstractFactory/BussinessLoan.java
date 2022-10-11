package com.gk.designPatterns.creational.abstractFactory;

public class BussinessLoan extends Loan {
    @Override
    void getInterestRate(double rate) {
        interestRate = rate;
    }
}
