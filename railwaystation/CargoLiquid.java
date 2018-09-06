package by.it.lanevich.railwaystation;

public class CargoLiquid extends CargoAll implements Cargo {
    final String t ="LIQUID";

    CargoLiquid() {
        super();

    }


    public void createWagon(WagonTank wagonTank) {
        wagonTank.createHWagon(hCargo);}

    @Override
    public void print() {
        for (int i = 0; i < cargo.size(); i++) {
                    System.out.println("Создано " + cargo.get(i) + " тонн жидкого груза в направлении " + direction.get(i));
        }
    }
}
