package com.gk.designPatterns.creational.abstractFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("BANK")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("LOAN")) {
            return new LoanFactory();
        }
        return null;
    }
}
