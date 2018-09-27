package by.it.lanevich.railwaystation3.cargo;


import by.it.lanevich.railwaystation3.util.TypeCargo;

public class CargoSolid extends CargoAll implements Cargo {


    CargoSolid(int direction, int weight) {
        super(direction, weight);
        typeCargo = TypeCargo.SOLID.toString();
    }

//    public String getTypeCargo() {
//        return typeCargo;
//    }


}
