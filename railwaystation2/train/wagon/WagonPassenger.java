package by.it.lanevich.railwaystation2.train.wagon;

public class WagonPassenger extends WagonAll implements Wagon {
    private int capacity = 100;
    private int tareWeight = 60;
    private int length = 25;


    public WagonPassenger(String typeCargo, int direction) {
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
