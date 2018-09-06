package by.it.lanevich.railwaystation;

public class CargoPeople extends CargoAll implements Cargo {
    final String t = "PEOPLE";


    CargoPeople() {
        super();

    }


    public void createWagon(WagonPassenger wagonPass) {
        wagonPass.createHWagon(hCargo);
    }

    public void print() {
        for (int i = 0; i < cargo.size(); i++) {
            System.out.println("Создано " + cargo.get(i) + " пассажиров в направлении " + direction.get(i));

        }

    }
}