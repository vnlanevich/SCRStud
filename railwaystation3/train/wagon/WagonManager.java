package by.it.lanevich.railwaystation3.train.wagon;

import by.it.lanevich.railwaystation3.cargo.*;

import java.util.List;


public class WagonManager {

    public static List<WagonAll> createWagon(List<CargoAll> listCargo, List<WagonAll> listWagon) {
        //listWagon = null;

        for (CargoAll c2 : listCargo) { //перебор всех элементов listCargo
            // TODO перенести в отдельный менеджер
            int ost = c2.getWeight(); // присваиваем ost вес всего груза
            do {
                WagonAll wagon = WagonFactory.getWagon(c2.getTypeCargo(), c2.getDirection()); //получаем вагон из фабрики согласно типу груза и направлению
                listWagon.add(wagon); //добавляем полученный вагон в лист вагонов listWagon
                ost = wagon.load(ost); //присвавивам ost остатку веса после загрузки этого вогона
            }
            while (ost > 0);
        }
        return listWagon;


    }


}
