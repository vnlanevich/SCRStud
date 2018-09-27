package by.it.lanevich.railwaystation3.cargo;

import by.it.lanevich.railwaystation3.util.Random;

import java.util.List;

public class CargoManager {

    public static List<CargoAll> createCargo(List<CargoAll> listCargo) {
        int n = 5; //кол-во создаваемых грузов
        int direction;
        int number; //единиц создаваемого груза
        for (int i = 0; i < n; i++) {
            direction = Random.rnd(5);
            number = Random.rnd(5000);
            CargoAll cargo = CargoFactory.getCargo(Random.rnd(3), direction, number);
            listCargo.add(cargo);
        }

        return listCargo;

    }


}
