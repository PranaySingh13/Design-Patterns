package com.gk.designPatterns.creational.abstractFactory;

public class ICICI implements Bank {
    private final String bName;

    public ICICI() {
        this.bName = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return bName;
    }
}