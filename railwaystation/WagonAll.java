package by.it.lanevich.railwaystation;

import java.util.HashMap;
import java.util.Map;

public abstract class WagonAll implements Wagon {
    int capacity;
    int tareWeight;
    Map<Integer,Integer> hWagon= new HashMap<>();

    WagonAll() {

    }


    @Override
    public void createLoco() {

    }

    @Override
    public void createHWagon (){


    }
    @Override
    public void print (){


    }

}
