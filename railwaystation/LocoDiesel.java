package by.it.lanevich.railwaystation;

public class LocoDiesel extends LocoAll implements Loco {
    public final static int powerLoco=2100;

    public LocoDiesel() {
        super();
    }


    public void print(){
        for (int i = 0; i < hLocoDir.size(); i++) {
            System.out.println("Поезд с дизельным локомотивом, состоящий из "+hLocoWagon.get(i)+" вагонов отправляется по направлению "+hLocoDir.get(i));
        }

    }



}
