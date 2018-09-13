package by.it.lanevich.railwaystation2.train.loco;

public class LocoDiesel extends LocoAll implements Loco{
    public final static int powerLoco=2100;
    private int tareWeight = 0;
    private int direction;



    public LocoDiesel(int direction){
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
