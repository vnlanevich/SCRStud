package by.it.lanevich.railwaystation3.main;


import by.it.lanevich.railwaystation3.train.TrainManager;
import by.it.lanevich.railwaystation3.train.loco.*;

public class RailwayStation {
    public static void main(String[] args) {
        TrainManager.createTrain();
    }

}

//проверка созданного груза:
//        for (CargoAll c : listCargo) {
//            System.out.println(c.getTypeCargo() + " dir " + c.getDirection() + " weight " + c.getWeight());
//
//        }
// загрузка вагонов
//        for (WagonAll w : listWagon) {
//            System.out.println(w.getClass().toString() + " weight " + w.getWeight() + " dir " + w.getDirection() + " capac " + w.getCapacity());
//
//        }




