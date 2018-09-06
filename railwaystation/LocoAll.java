package by.it.lanevich.railwaystation;

import java.util.ArrayList;
import java.util.List;


public abstract class LocoAll implements Loco {
    public int powerLoco;

 public List<Integer> hLocoDir=new ArrayList<>();
public List<Integer> hLocoWagon=new ArrayList<>();


    LocoAll() {
    }

    @Override
 public void print(){

}
    @Override
    public void createLoco(){}
    @Override
    public void createHWagon (){}
}




