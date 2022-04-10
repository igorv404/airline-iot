package ua.lviv.iot.airline.models;

public abstract class Plane {
  String model;
  int fuelVolume;
  int flightRange;

  public Plane(String model, int fuelVolume, int flightRange) {
    this.model = model;
    this.fuelVolume = fuelVolume;
    this.flightRange = flightRange;
  }
}
