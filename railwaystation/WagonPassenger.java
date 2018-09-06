package by.it.lanevich.railwaystation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WagonPassenger extends WagonAll implements Wagon {
   final static int capacity = 100;
   final static int tareWeight = 60;


    public WagonPassenger(){

    }

    public void createHWagon (Map<Integer, Integer> hCargo){
        for (Map.Entry<Integer, Integer> item : hCargo.entrySet()
                ) {
            hWagon.put(item.getKey(), (int) Math.ceil((double) item.getValue() / capacity));
        }


    }
    public void print(){
        for (Map.Entry<Integer, Integer> item : hWagon.entrySet()
                ) {
            System.out.printf("Направление %s = %s пассажирских вагонов \n", item.getKey(), item.getValue());
        }
    }

    public void createLoco(LocoDiesel locoDiesel,LocoElectric locoElectric) {
        for (Map.Entry<Integer, Integer> item : hWagon.entrySet()
                ) {
            int k = (capacity * 80) / 100 + tareWeight;
            int m = item.getValue() * k;
            if (m <= locoDiesel.powerLoco) {
                locoDiesel.hLocoDir.add(item.getKey());
                locoDiesel.hLocoWagon.add(item.getValue());
            } else if (m <= locoElectric.powerLoco) {
                locoElectric.hLocoDir.add(item.getKey());
                locoElectric.hLocoWagon.add(item.getValue());
            } else {
                for (int i = 0; i < (int) (m / locoElectric.powerLoco); i++) {
                    locoElectric.hLocoDir.add(item.getKey());
                    locoElectric.hLocoWagon.add(locoElectric.powerLoco / k);
                }
                int m1 = m - ((int) (m / locoElectric.powerLoco)) * locoElectric.powerLoco;
                if (m1 > 0 && m1 <= locoDiesel.powerLoco) {
                    locoDiesel.hLocoDir.add(item.getKey());
                    locoDiesel.hLocoWagon.add(m1 / k);
                } else {
                    for (int i = 0; i < (int) (m1 / locoDiesel.powerLoco); i++) {
                        locoDiesel.hLocoDir.add(item.getKey());
                        locoDiesel.hLocoWagon.add(locoDiesel.powerLoco / k);
                    }
                    int m2 = m1 - ((int) (m1 / locoDiesel.powerLoco)) * locoDiesel.powerLoco;
                    if (m2 > 0) {
                        locoDiesel.hLocoDir.add(item.getKey());
                        locoDiesel.hLocoWagon.add(m2 / k);
                    }
                }

            }

        }
    }
}


