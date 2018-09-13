package by.it.lanevich.railwaystation2.cargo;


public class CargoLiquid extends CargoAll implements Cargo {
    private final String typeCargo = "LIQUID";


   CargoLiquid(int direction, int weight) {
        super(direction, weight);

    }

    public String getTypeCargo() {
        return typeCargo;
    }


}
