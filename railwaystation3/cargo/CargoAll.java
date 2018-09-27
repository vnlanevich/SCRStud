package by.it.lanevich.railwaystation3.cargo;

public abstract class CargoAll implements Cargo {

    private int direction;
    protected int weight;
    protected String typeCargo = null;

    public CargoAll() {
    }

    CargoAll(int direction, int weight) {
        this.direction = direction;
        this.weight = weight;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    public int getDirection() {
        return direction;
    }

    public int getWeight() {
        return weight;
    }
}