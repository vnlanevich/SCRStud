package by.it.lanevich.railwaystation;

public class RailwayStation {


    public static void main(String[] args) {

        CargoPeople cargoPeople = new CargoPeople();
        CargoSolid cargoSolid = new CargoSolid();
        CargoLiquid cargoLiquid = new CargoLiquid();
        cargoPeople.print();
        cargoSolid.print();
        cargoLiquid.print();
        WagonPassenger wagonPassenger = new WagonPassenger();
        WagonCoveredGoods wagonCoveredGoods = new WagonCoveredGoods();
        WagonTank wagonTank = new WagonTank();
        cargoPeople.createHCargo();
        cargoPeople.createWagon(wagonPassenger);
        cargoSolid.createHCargo();
        cargoSolid.createWagon(wagonCoveredGoods);
        cargoLiquid.createHCargo();
        cargoLiquid.createWagon(wagonTank);
        System.out.println("Итого вагонов по направлениям:");
        wagonPassenger.print();
        wagonCoveredGoods.print();
        wagonTank.print();
        LocoElectric locoElectric =new LocoElectric();
        LocoDiesel locoDiesel=new LocoDiesel();
        LocoHighSpeed locoHighSpeed=new LocoHighSpeed();
        wagonPassenger.createLoco(locoDiesel,locoElectric);
        wagonCoveredGoods.createLoco(locoElectric,locoHighSpeed);
        wagonTank.createLoco(locoElectric,locoHighSpeed);
        locoDiesel.print();
        locoElectric.print();
        locoHighSpeed.print();

    }

}


