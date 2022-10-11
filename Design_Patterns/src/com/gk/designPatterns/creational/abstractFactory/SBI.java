package com.gk.designPatterns.creational.abstractFactory;

public class SBI implements Bank {

    private final String bName;

    public SBI() {
        this.bName = "SBI BANK";
    }

    @Override
    public String getBankName() {
        return bName;
    }
}
