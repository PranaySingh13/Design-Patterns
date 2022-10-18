package com.gk.designPatterns.creational.singleton;

public class EarlyInstantiationUsingStaticBlock {

    //public static member
    public static EarlyInstantiationUsingStaticBlock eisbObj;

    //private constructor
    private EarlyInstantiationUsingStaticBlock(){}

    // static block to initialize instance
    static {
        eisbObj=new EarlyInstantiationUsingStaticBlock();
    }
}
