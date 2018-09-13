package by.it.lanevich.railwaystation2.train.loco;

public class LocoElectric extends LocoAll implements Loco {
  public final static int powerLoco=3780;
    private int tareWeight = 0;
    private int direction;



    public LocoElectric(int direction){
        super(direction);
    }

    @Override
    public int getDirection() {
        return direction;
    }

    @Override
    public int getTareWeight() {
        return tareWeight;
    }


}


