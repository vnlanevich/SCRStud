package by.it.lanevich.railwaystation3.train.loco;

public class LocoDiesel extends LocoAll implements Loco {
   // public final static int powerLoco=2100;
    private int tareWeight = 120;
    private int direction;



    public LocoDiesel(int direction){
        super(direction);
    }

    public static int getPowerLoco() {
        powerLoco = 2100;
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
