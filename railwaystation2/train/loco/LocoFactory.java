package by.it.lanevich.railwaystation2.train.loco;

public abstract class LocoFactory {

    public static LocoAll getLoco(String typeCargo, int trainWeight,int direction) {

        if ((typeCargo.equals("PEOPLE")) && (trainWeight > LocoDiesel.powerLoco))
            return new LocoElectric(direction);
        if ((typeCargo.equals("PEOPLE")) && (trainWeight <= LocoDiesel.powerLoco))
            return new LocoDiesel(direction);


        if (((typeCargo.equals("SOLID"))||(typeCargo.equals("LIQUID"))) && (trainWeight <= LocoElectric.powerLoco))
            return new LocoElectric(direction);
        if (((typeCargo.equals("SOLID")) ||(typeCargo.equals("LIQUID")))&& (trainWeight > LocoElectric.powerLoco))
            return new LocoHighSpeed(direction);

          return null;
    }

}
