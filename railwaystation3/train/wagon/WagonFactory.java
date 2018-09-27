package by.it.lanevich.railwaystation3.train.wagon;

public class WagonFactory{

    public static WagonAll getWagon(String typeCargo, int direction){
       switch (typeCargo){
           case "LIQUID":
               return new WagonTank(typeCargo, direction);
           case "PEOPLE":
               return new WagonPassenger(typeCargo, direction);
           case "SOLID":
               return new WagonCoveredGoods(typeCargo, direction);
       }
        return null;
    }


}
