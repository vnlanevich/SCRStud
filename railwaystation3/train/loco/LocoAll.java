package by.it.lanevich.railwaystation3.train.loco;

import by.it.lanevich.railwaystation3.train.wagon.WagonAll;

public abstract class LocoAll extends WagonAll implements Loco {
    private boolean locked = false;
    private int direction;
    protected static int powerLoco;

    LocoAll() {

    }

    LocoAll(int direction) {
        this.direction = direction;
     //   this.powerLoco = powerLoco;
    }

    public void setLocked() {
        this.locked = true;
    }

    public void setUnLocked() {
        this.locked = false;
    }

    public boolean isLocked() {
        return locked;
    }

    public static int getPowerLoco() {
        return powerLoco;
    }
}
