package by.it.lanevich.railwaystation2.train;

import by.it.lanevich.railwaystation2.train.loco.LocoElectric;
import by.it.lanevich.railwaystation2.train.loco.LocoHighSpeed;
import by.it.lanevich.railwaystation2.train.wagon.WagonAll;

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


        @Override
    public boolean add(WagonAll wagonAll) {
            int oldTrainWeight=trainWeight;
        if(wagonAll.getTypeCargo().equals("PEOPLE"))
             trainWeight+=wagonAll.getTareWeight()+Math.ceil(wagonAll.getWeight()*0.08);
        else trainWeight+=wagonAll.getTareWeight()+wagonAll.getWeight();
        if (( typeCargo.equals("PEOPLE")&&(trainWeight > LocoElectric.powerLoco))
                ||( !(typeCargo.equals("PEOPLE"))&&(trainWeight> LocoHighSpeed.powerLoco))){
           trainWeight=oldTrainWeight;
            return false;
            }
        wagonAll.setLocked();
        return super.add(wagonAll);

    }

    @Override
    public void addFirst(WagonAll wagonAll) {
        trainWeight+=wagonAll.getTareWeight();
        wagonAll.setLocked();
        super.addFirst(wagonAll);
    }


    public int getTrainWeight() {
        return trainWeight;
    }

    }



