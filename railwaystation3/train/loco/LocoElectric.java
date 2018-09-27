package by.it.lanevich.railwaystation3.train.loco;

public class LocoElectric extends LocoAll implements Loco {
    // public final static int powerLoco=3780;
    private int tareWeight = 160;
    private int direction;

    public LocoElectric(int direction) {
        super(direction);
    }


    public static int getPowerLoco() {
        powerLoco = 3780;
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


