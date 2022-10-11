package com.gk.designPatterns.creational.abstractFactory;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null)
            return null;
        else if (loan.equalsIgnoreCase("HOME")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("BUSSINESS")) {
            return new BussinessLoan();
        } else if (loan.equalsIgnoreCase("EDUCATION")) {
            return new EducationLoan();
        }
        return null;
    }
}
