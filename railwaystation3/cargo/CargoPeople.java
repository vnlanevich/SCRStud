package by.it.lanevich.railwaystation3.cargo;


import by.it.lanevich.railwaystation3.util.TypeCargo;

public class CargoPeople extends CargoAll implements Cargo {
 //   private int weight;

    CargoPeople(int direction, int weight) {  //
        super(direction, weight);
        typeCargo = TypeCargo.PEOPLE.toString();
    }

//    public String getTypeCargo() {
//        return typeCargo;
//    }


    public int getWeight() {
       return (int) Math.ceil(weight * 0.08);
    //    return weight;
    }
}


