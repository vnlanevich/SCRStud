package by.it.lanevich.railwaystation;

public class LocoElectric extends LocoAll implements Loco{

   public final static int powerLoco=3780;

    public LocoElectric() {
        super();
    }

    public void print(){
        for (int i = 0; i < hLocoDir.size(); i++) {
            System.out.println("Поезд с электрическим локомотивом, состоящий из "+hLocoWagon.get(i)+" вагонов отправляется по направлению "+hLocoDir.get(i));
        }

    }
// должен быть метод, который объединяет вагоны цистерны и крытые вагоны


    }

