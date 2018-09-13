package by.it.lanevich.railwaystation2.cargo;

public abstract class CargoAll implements Cargo {

    private int direction;
    private int weight;

    public CargoAll() {
    }

    CargoAll(int direction, int weight) {
        this.direction = direction;
        this.weight = weight;
    }

   public int getDirection() {
        return direction;
    }

    public int getWeight() {
        return weight;
    }
}