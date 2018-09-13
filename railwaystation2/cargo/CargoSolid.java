package by.it.lanevich.railwaystation2.cargo;



public class CargoSolid extends CargoAll implements Cargo {
    private final String typeCargo ="SOLID";

    CargoSolid(int direction, int weight){
        super(direction, weight);
    }

    public String getTypeCargo() {
        return typeCargo;
    }



}
