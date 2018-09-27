package by.it.lanevich.railwaystation3.train.loco;


public class LocoHighSpeed extends LocoAll implements Loco {
   // public final static int powerLoco=6300;
    private int tareWeight = 110;
    private int direction;

    public LocoHighSpeed(int direction){
        super(direction);
    }

    public static int getPowerLoco() {
        powerLoco = 6380;
        return powerLoco;
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
