package org.kai.service;

public class EhanDemo {
    private static EhanDemo INSTANCE;
    private EhanDemo(){

    }
    public  static  EhanDemo getInstance(){
        if (INSTANCE  ==null){
            INSTANCE =    new EhanDemo();
        }
        return  INSTANCE;
    }
}
