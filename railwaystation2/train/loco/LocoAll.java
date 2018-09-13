package by.it.lanevich.railwaystation2.train.loco;

import by.it.lanevich.railwaystation2.train.wagon.WagonAll;

public abstract class LocoAll extends WagonAll implements Loco {
    private boolean locked = false;
    private int direction;
    private boolean drive = false;

    LocoAll() {

    }

    LocoAll(int direction) {
        this.direction = direction;
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

    public void stopLoco() { this.drive = false; }

    public void driveLoco() { this.drive = true; }
}
