package com.gk.designPatterns.creational.abstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of bank from where you want to take loan amount: ");
        String bankName = br.readLine();
        System.out.println("Enter the type of loan e.g. home loan or bussiness loan or education loan: ");
        String loanName = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for: " + bank.getBankName());
        double rate = Double.parseDouble(br.readLine());

        System.out.println("Enter the loan amount you want to take: ");
        double loanAmount = Double.parseDouble(br.readLine());

        System.out.println("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.println("You are taking the loan from " + bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("LOAN");
        Loan loan = loanFactory.getLoan(loanName);

        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
    }
}
