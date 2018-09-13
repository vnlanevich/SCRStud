package by.it.lanevich.railwaystation2.cargo;



public class CargoPeople extends CargoAll implements Cargo {
    private final String typeCargo = "PEOPLE";



    CargoPeople(int direction, int weight) {
      super(direction, weight);

    }

    public String getTypeCargo() {
        return typeCargo;
    }

}


