package by.it.lanevich.railwaystation;

import java.util.*;


public abstract class CargoAll implements Cargo {
    String t;
    List<Integer> direction = new ArrayList<>();
    List<Integer> cargo = new ArrayList<>();
    Map<Integer, Integer> hCargo = new HashMap<>();

    CargoAll() {
        for (int i = 0; i < 5; i++) {
            cargo.add(Random.rnd(10000));
            direction.add(Random.rnd(5));
        }
    }

    @Override
    public void createWagon(){}

    @Override
    public void createHCargo(){
        int g;
        for (int i = 0; i < 5; i++) {
            if (hCargo.containsKey(direction.get(i))) {
                g = hCargo.get(direction.get(i));
                hCargo.put(direction.get(i), g + cargo.get(i));
            } else hCargo.put(direction.get(i), cargo.get(i));
        }

    }
    @Override
    public void print(){

    }
}
