package by.it.lanevich.railwaystation;



public class LocoHighSpeed extends LocoAll implements Loco {
    public final static int powerLoco=6300;

    public LocoHighSpeed() {
        super();
    }

    public void print(){
        for (int i = 0; i < hLocoDir.size(); i++) {
            System.out.println("Поезд с супер электрическим локомотивом, состоящий из "+hLocoWagon.get(i)+" вагонов отправляется по направлению "+hLocoDir.get(i));
        }

    }

}

