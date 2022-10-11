package com.gk.designPatterns.creational.abstractFactory;

public class HDFC implements Bank {

    private final String bName;

    public HDFC() {
        this.bName = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return bName;
    }
}
