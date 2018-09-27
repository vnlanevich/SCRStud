package by.it.lanevich.railwaystation3.cargo;

import by.it.lanevich.railwaystation3.util.Random;

public class CargoFactory{

    public static CargoAll getCargo(int rnd, int direction, int number) {
        //рандомное создание конструкторов, направлений и кол-ва грузов(weight в тоннах для Liquid, Solid и количество для People)
        switch (rnd) {
            case 1:
                return new CargoPeople(direction,number);
            case 2:
                return new CargoSolid(direction,number);
            case 3:
                return new CargoLiquid(direction,number);
        }
        return null;
    }
}

