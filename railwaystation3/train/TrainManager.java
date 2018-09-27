package by.it.lanevich.railwaystation3.train;

import by.it.lanevich.railwaystation3.cargo.CargoAll;
import by.it.lanevich.railwaystation3.cargo.CargoFactory;
import by.it.lanevich.railwaystation3.cargo.CargoManager;
import by.it.lanevich.railwaystation3.train.loco.LocoManager;
import by.it.lanevich.railwaystation3.train.wagon.WagonAll;
import by.it.lanevich.railwaystation3.train.wagon.WagonManager;
import by.it.lanevich.railwaystation3.util.TypeCargo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainManager {

    public static void createTrain() {
        String answer = null;

        List<WagonAll> listWagon1 = new ArrayList<>();
        List<Train> listTrain1 = new ArrayList<>();


        List<CargoAll> listCargo = new ArrayList<>();
        listCargo = CargoManager.createCargo(listCargo);

        List<WagonAll> listWagon = new ArrayList<>(); //создаем лист вагонов
        listWagon = WagonManager.createWagon(listCargo, listWagon);

        List<Train> listTrain = new ArrayList<>(); //создаем лист поездов
        listTrain = createListTrain(listWagon, listTrain);
        printTrain(listTrain);

        addMoreCargo(answer, listCargo);
        if (listCargo.size() > 5) {
            listWagon1 = WagonManager.createWagon(listCargo, listWagon1);
            listTrain1 = createListTrain(listWagon1, listTrain1);
            printTrain(listTrain1);
        }

    }

    public static List<Train> createListTrain(List<WagonAll> listWagon, List<Train> listTrain) {


        for (WagonAll item : listWagon) {

            int dir = item.getDirection();
            String type = item.getTypeCargo();
            boolean needTrain = true;
            for (Train itemTrain : listTrain) {
                if (((itemTrain.getDirection() == dir) && (itemTrain.getTypeCargo() == type)) ||
                        ((itemTrain.getDirection() == dir) && (!itemTrain.getTypeCargo().equals(TypeCargo.PEOPLE.toString())) && (!type.equals(TypeCargo.PEOPLE.toString())))) {
                    boolean isWagonAdd = itemTrain.add(item);
                    needTrain = false;
                    if (!isWagonAdd) needTrain = true;
                }
            }
            if (needTrain) {
                Train train = new Train(dir, type);
                listTrain.add(train);
                train.add(item);
            }
        }
        listTrain = LocoManager.createLoco(listTrain);
        return listTrain;
    }

    public static void printTrain(List<Train> listTrain) {

        for (Train t : listTrain) {
            System.out.println("Поезд с локомотивом " + t.getFirst().getClass().getSimpleName() + " с количеством вагонов " + (t.size() - 1)
                    + " отправляется в направлении " + t.getDirection() + ". Вес поезда " + t.getTrainWeight() + " тип груза " + t.getTypeCargo());
        }

    }

    public static List<CargoAll> addMoreCargo(String answer, List<CargoAll> listCargo) {
        System.out.println("Хотите добавить еще груз в вагоны? (Y-да; N-нет)");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        switch (answer) {
            case "Y":
                System.out.println("Введите тип груза ( 1-PEOPLE, 2-SOLID, 3-LIQUID)");
                int typeCargo = scanner.nextInt();
                System.out.println("Введите направление (1-5)");
                int direction = scanner.nextInt();
                System.out.println("Введите вес груза в тоннах для типов LIQUID, SOLID; количество для типа PEOPLE");
                int number = scanner.nextInt();
                //   System.out.println("Введены следующие параметры груза " + typeCargo + " " + direction + " " + number);
                CargoAll cargo1 = CargoFactory.getCargo(typeCargo, direction, number);
                listCargo.add(cargo1);
                break;
            case "N":
                System.out.println("Поезда отправляются без дозагрузки");
                break;
            default:
                System.out.println("Нужный символ не был введен. Поезда отправляются без дозагрузки.");

                break;
        }
        return null;
    }
}