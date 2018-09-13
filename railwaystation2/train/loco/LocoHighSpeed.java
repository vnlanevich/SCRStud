package by.it.lanevich.railwaystation2.train.loco;


public class LocoHighSpeed extends LocoAll implements Loco{
    public final static int powerLoco=6300;
    private int tareWeight = 0;
    private int direction;

    public LocoHighSpeed(int direction){
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
