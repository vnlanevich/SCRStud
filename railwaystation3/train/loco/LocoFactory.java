package by.it.lanevich.railwaystation3.train.loco;

import by.it.lanevich.railwaystation3.util.TypeCargo;

public abstract class LocoFactory {

    public static LocoAll getLoco(String typeCargo, int trainWeight, int direction) {

        if ((typeCargo.equals(TypeCargo.PEOPLE.toString())) && (trainWeight > LocoDiesel.getPowerLoco()))
            return new LocoElectric(direction);
        if ((typeCargo.equals(TypeCargo.PEOPLE.toString())) && (trainWeight <= LocoDiesel.getPowerLoco()))
            return new LocoDiesel(direction);


        if (((typeCargo.equals(TypeCargo.SOLID.toString()))||(typeCargo.equals(TypeCargo.LIQUID.toString()))) && (trainWeight <= LocoElectric.getPowerLoco()))
            return new LocoElectric(direction);
        if (((typeCargo.equals(TypeCargo.SOLID.toString())) ||(typeCargo.equals(TypeCargo.LIQUID.toString())))&& (trainWeight > LocoElectric.getPowerLoco()))
            return new LocoHighSpeed(direction);

          return null;
    }

}
