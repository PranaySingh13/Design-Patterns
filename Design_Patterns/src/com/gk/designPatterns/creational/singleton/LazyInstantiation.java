package com.gk.designPatterns.creational.singleton;

public class LazyInstantiation {

    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static LazyInstantiation liObj;

    //private constructor
    private LazyInstantiation() {
    }

    //public static factory method
    public static LazyInstantiation getLazyInstantiation() {
        //synchronized block to remove overhead
        synchronized (LazyInstantiation.class) {
            liObj = new LazyInstantiation();
        }
        return liObj;
    }
}
