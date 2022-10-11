package com.gk.designPatterns.creational.abstractFactory;

public class HomeLoan extends Loan {
    @Override
    void getInterestRate(double rate) {
        interestRate = rate;
    }
}
