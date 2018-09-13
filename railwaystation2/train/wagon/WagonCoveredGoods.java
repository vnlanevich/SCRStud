package by.it.lanevich.railwaystation2.train.wagon;

public class WagonCoveredGoods extends WagonAll implements Wagon {

    private int capacity = 70;
    private int tareWeight = 20;
    private int length = 15;

    WagonCoveredGoods(String typeCargo, int direction) {
        super(typeCargo, direction);

    }

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }

    public int getTareWeight() {
        return tareWeight;
    }

}
