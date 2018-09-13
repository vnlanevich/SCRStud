package by.it.lanevich.railwaystation2.cargo;

import by.it.lanevich.railwaystation2.util.Random;

public class CargoFactory{

    public static CargoAll getCargo(int rnd) {
        //рандомное создание конструкторов, направлений и кол-ва грузов
        switch (rnd) {
            case 1:
                return new CargoPeople(Random.rnd(5),Random.rnd(5000));
            case 2:
                return new CargoSolid(Random.rnd(5),Random.rnd(5000));
            case 3:
                return new CargoLiquid(Random.rnd(5),Random.rnd(5000));
        }
        return null;
    }
}

