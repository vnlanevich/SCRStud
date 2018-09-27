package by.it.lanevich.railwaystation3.train.wagon;

public interface Wagon {
  int getCapacity();
  int getLength();
  int getTareWeight();
  String getTypeCargo();
  int getWeight();
  int getDirection();
  void setLocked();
  void setUnLocked();
  boolean isLocked();
}
