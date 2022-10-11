package com.gk.designPatterns.creational.abstractFactory;

public class EducationLoan extends Loan {
    @Override
    void getInterestRate(double rate) {
        interestRate = rate;
    }
}
