package by.it.lanevich.railwaystation3.train.loco;

import by.it.lanevich.railwaystation3.train.Train;

import java.util.List;

public class LocoManager {
    public static List<Train> createLoco(List<Train> listTrain) {
        for (Train t : listTrain) {
            LocoAll loco = LocoFactory.getLoco(t.getTypeCargo(), t.getTrainWeight(), t.getDirection());
            t.addFirst(loco);
        }
        return listTrain;

    }


}
