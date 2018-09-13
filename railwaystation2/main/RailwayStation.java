package by.it.lanevich.railwaystation2.main;


import by.it.lanevich.railwaystation2.cargo.*;
import by.it.lanevich.railwaystation2.train.Train;
import by.it.lanevich.railwaystation2.train.loco.LocoAll;
import by.it.lanevich.railwaystation2.train.loco.LocoFactory;
import by.it.lanevich.railwaystation2.train.wagon.*;
import by.it.lanevich.railwaystation2.util.Random;

import java.util.*;

public class RailwayStation {
    public static void main(String[] args) {
        int n = 5; //кол-во создаваемых грузов

        List<CargoAll> listCargo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            CargoAll cargo = CargoFactory.getCargo(Random.rnd(3));
            listCargo.add(cargo);
        }

        //проверка созданного груза:
//        for (CargoAll c : listCargo) {
//            System.out.println(c.getTypeCargo() + " dir " + c.getDirection() + " weight " + c.getWeight());
//
//        }

        // загрузка вагонов
        List<WagonAll> listWagon = new ArrayList<>();
        for (CargoAll c2 : listCargo) {
            int ost = c2.getWeight();
            do {
                WagonAll wagon = WagonFactory.getWagon(c2.getTypeCargo(), c2.getDirection());
                listWagon.add(wagon);
                ost = wagon.load(ost);
            }
            while (ost > 0);
        }

//        for (WagonAll w : listWagon) {
//            System.out.println(w.getClass().toString() + " weight " + w.getWeight() + " dir " + w.getDirection() + " capac " + w.getCapacity());
//
//        }

        //Создание составов

        List<Train> listTrain = new ArrayList<>();

        for (WagonAll item : listWagon) {

            int dir = item.getDirection();
            String type = item.getTypeCargo();
            boolean needTrain = true;
            for (Train itemTrain : listTrain) {
                if (((itemTrain.getDirection() == dir) && (itemTrain.getTypeCargo() == type)) ||
                        ((itemTrain.getDirection() == dir) && (!itemTrain.getTypeCargo().equals("PEOPLE")) && (!type.equals("PEOPLE")))) {
                    boolean isWagonAdd = itemTrain.add(item);
                    needTrain = false;
                    if (!isWagonAdd) needTrain = true;
                }
            }
            if (needTrain) {
                Train train = new Train(dir, type);
                listTrain.add(train);
                train.add(item);
            }
        }

//        for (Train t : listTrain) {
//            System.out.println(" dir " + t.getDirection() + " type " + t.getTypeCargo() + " weight " + t.getTrainWeight());
//        }

        for (Train t : listTrain) {
            LocoAll loco = LocoFactory.getLoco(t.getTypeCargo(), t.getTrainWeight(), t.getDirection());
            t.addFirst(loco);
        }
        for (Train t : listTrain) {
            System.out.println("Поезд с локомотивом " + t.getFirst().getClass().getSimpleName() + " с количеством вагонов " + (t.size() - 1)
                    + " отправляется в направлении " + t.getDirection() + ". Вес поезда " + t.getTrainWeight() + " тип груза " + t.getTypeCargo());
        }

    }

}






