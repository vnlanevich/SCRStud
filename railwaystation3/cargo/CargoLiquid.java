package by.it.lanevich.railwaystation3.cargo;


import by.it.lanevich.railwaystation3.util.TypeCargo;

public class CargoLiquid extends CargoAll implements Cargo {

    CargoLiquid(int direction, int weight) {
        super(direction, weight);
        typeCargo = TypeCargo.LIQUID.toString();
    }
//
//    public String getTypeCargo() {
//        return typeCargo;
//    }


}
