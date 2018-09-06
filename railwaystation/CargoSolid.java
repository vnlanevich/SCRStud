package by.it.lanevich.railwaystation;


public class CargoSolid extends CargoAll implements Cargo {

    final String t = "SOLID";

    CargoSolid() {
        super();

    }


    public void createWagon(WagonCoveredGoods wagonCoveredGoods) {
        wagonCoveredGoods.createHWagon(hCargo);}


    public void print() {
        for (int i = 0; i < cargo.size(); i++) {
            System.out.println("Создано " + cargo.get(i) + " тонн твердого груза в направлении " + direction.get(i));
                    }
    }
}

