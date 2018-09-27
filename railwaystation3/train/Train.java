package by.it.lanevich.railwaystation3.train;

import by.it.lanevich.railwaystation3.train.loco.*;
import by.it.lanevich.railwaystation3.train.wagon.WagonAll;
import by.it.lanevich.railwaystation3.train.wagon.WagonPassenger;

import java.util.LinkedList;


public class Train extends LinkedList<WagonAll> {
    private int trainLenght;
    private int trainWeight;
    private int direction;
    private String typeCargo;

    public Train() {

    }

    public Train(int direction, String typeCargo) {
        this.direction = direction;
        this.typeCargo = typeCargo;
    }

    public String getTypeCargo() {
        return typeCargo;
    }


    public int getDirection() {
        return direction;
    }

    private int summaryTrainWeight(WagonAll wagonAll) {
        trainWeight += wagonAll.getTareWeight() + wagonAll.getWeight();
        return trainWeight;
    }

    @Override
    public boolean add(WagonAll wagonAll) {
        int oldTrainWeight = trainWeight;
        summaryTrainWeight(wagonAll);
        if ((wagonAll instanceof WagonPassenger && (trainWeight > LocoElectric.getPowerLoco()))
                || (!(wagonAll instanceof WagonPassenger) && (trainWeight > LocoHighSpeed.getPowerLoco()))) {
            trainWeight = oldTrainWeight;
            return false;
        }
        wagonAll.setLocked();
        return super.add(wagonAll);

    }

    @Override
    public void addFirst(WagonAll wagonAll) {
        trainWeight += wagonAll.getTareWeight();
        wagonAll.setLocked();
        super.addFirst(wagonAll);
    }


    public int getTrainWeight() {
        return trainWeight;
    }

}



