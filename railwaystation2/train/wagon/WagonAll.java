package by.it.lanevich.railwaystation2.train.wagon;


public abstract class WagonAll implements Wagon {
    private int capacity;
    private int tareWeight;
    private int length;
    private String typeCargo;
    private boolean load;
    private int weight;
    private int direction;
    private boolean locked = false;

    public WagonAll() {
    }

    public WagonAll(String typeCargo, int direction) {
        this.typeCargo = typeCargo;
        this.direction = direction;
    }

    public int load(int weight) {
        load = true;
        if (weight >= this.getCapacity()) {
            this.weight = this.getCapacity();
            return (weight - this.getCapacity());
        } else {
            this.weight = weight;
            return 0;
        }

    }

    public void unLoad() {
        load = false;
        this.weight = 0;
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

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    public int getTareWeight() {
        return tareWeight;
    }

    public int getWeight() {
        return weight;
    }

    public int getDirection() {
        return direction;
    }
}
