package by.it.lanevich.railwaystation3.train.wagon;

public class WagonTank extends WagonAll implements Wagon {


    public WagonTank(String typeCargo, int direction) {
        super(typeCargo, direction);
        capacity = 59;
        tareWeight = 25;
        length = 12;
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
