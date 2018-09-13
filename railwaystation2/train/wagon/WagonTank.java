package by.it.lanevich.railwaystation2.train.wagon;

public class WagonTank extends WagonAll implements Wagon {
    private int capacity = 59;
    private int tareWeight = 25;
    private int length = 12;

    public WagonTank(String typeCargo, int direction) {
      super(typeCargo,direction);

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
