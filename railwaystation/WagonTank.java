package by.it.lanevich.railwaystation;


import java.util.*;

public class WagonTank extends WagonAll {
    final static int capacity = 59;
    final static int tareWeight = 25;

    WagonTank() {

    }

    public void createHWagon(Map<Integer, Integer> hCargo) {
        for (Map.Entry<Integer, Integer> item : hCargo.entrySet()
                ) {
            hWagon.put(item.getKey(), (int) Math.ceil((double) item.getValue() / capacity));
        }


    }

    public void print() {
        for (Map.Entry<Integer, Integer> item : hWagon.entrySet()
                ) {
            System.out.printf("Направление %s = %s цистерн \n", item.getKey(), item.getValue());
        }
    }


    public void createLoco(LocoElectric locoElectric, LocoHighSpeed locoHighSpeed) {

        for (Map.Entry<Integer, Integer> item : hWagon.entrySet()
                ) {
            int k = capacity + tareWeight;
            int m = item.getValue() * k;
            if (m <= locoElectric.powerLoco) {
                locoElectric.hLocoDir.add(item.getKey());
                locoElectric.hLocoWagon.add(item.getValue());
            } else if (m <= locoHighSpeed.powerLoco) {
                locoHighSpeed.hLocoDir.add(item.getKey());
                locoHighSpeed.hLocoWagon.add(item.getValue());
            } else {
                for (int i = 0; i < (int) (m / locoHighSpeed.powerLoco); i++) {
                    locoHighSpeed.hLocoDir.add(item.getKey());
                    locoHighSpeed.hLocoWagon.add(locoHighSpeed.powerLoco / k);
                }
                int m1 = m - ((int) (m / locoHighSpeed.powerLoco)) * locoHighSpeed.powerLoco;
                if (m1 > 0 && m1 <= locoElectric.powerLoco) {
                    locoElectric.hLocoDir.add(item.getKey());
                    locoElectric.hLocoWagon.add(m1 / k);
                } else {
                    for (int i = 0; i < (int) (m1 / locoElectric.powerLoco); i++) {
                        locoElectric.hLocoDir.add(item.getKey());
                        locoElectric.hLocoWagon.add(locoElectric.powerLoco / k);
                    }
                    int m2 = m1 - ((int) (m1 / locoElectric.powerLoco)) * locoElectric.powerLoco;
                    if (m2 > 0) {
                        locoElectric.hLocoDir.add(item.getKey());
                        locoElectric.hLocoWagon.add(m2 / k);
                    }
                }
            }
        }

    }
}
