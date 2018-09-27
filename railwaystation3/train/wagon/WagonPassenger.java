package by.it.lanevich.railwaystation3.train.wagon;

public class WagonPassenger extends WagonAll implements Wagon {

    public WagonPassenger(String typeCargo, int direction) {
        super(typeCargo, direction);
        capacity = 8; //грузоподъемность: 100 человек=8 тонн
        tareWeight = 60;
        length = 25;
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
