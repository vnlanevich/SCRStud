package by.it.lanevich.railwaystation3.train.wagon;

public class WagonCoveredGoods extends WagonAll implements Wagon {

    WagonCoveredGoods(String typeCargo, int direction) {
        super(typeCargo, direction);
        capacity = 70;
        tareWeight = 20;
        length = 15;
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
