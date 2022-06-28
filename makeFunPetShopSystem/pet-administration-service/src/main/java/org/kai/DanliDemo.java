package org.kai;

public class DanliDemo {
    private static final DanliDemo INSTANCE = new DanliDemo();

    private DanliDemo(){};

    public  static DanliDemo  getInstance(){
        return INSTANCE;

    }

}
