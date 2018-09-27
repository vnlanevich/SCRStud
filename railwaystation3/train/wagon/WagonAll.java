package by.it.lanevich.railwaystation3.train.wagon;


public abstract class WagonAll implements Wagon {
    protected int capacity;
    protected int tareWeight;
    protected int length;
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
        if (weight >= this.getCapacity()) {    //грузим вагон по полной грузоподъемности Capacity если вес груза больше или равен Capacity
            this.weight = this.getCapacity();
            return (weight - this.getCapacity()); //возвращаем остаток после загрузки одного вагона
        } else {
            this.weight = weight;     //грузим остаток груза в вагон если вес груза меньше Capacity
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
