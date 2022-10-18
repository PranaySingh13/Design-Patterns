package com.gk.designPatterns.creational.singleton;

class EarlyInstantiation {

    // private instance, so that it can be
    // accessed by only by getInstance() method
    //Early, instance will be created at load time
    private static EarlyInstantiation eiObj=new EarlyInstantiation();

    //Private Constructor
    private EarlyInstantiation(){}

    //public Static Factory Method
    public static EarlyInstantiation getEarlyInstantiationAccess(){
        return eiObj;
    }
}
