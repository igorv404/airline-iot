package ua.lviv.iot.airline.models;

public abstract class Plane {
  String model;
  int fuelVolume;
  int flightRange;
  int countOfFlights;
  String type;

  public Plane(String model, int fuelVolume, int flightRange, int countOfFlights, String type) {
    this.model = model;
    this.fuelVolume = fuelVolume;
    this.flightRange = flightRange;
    this.countOfFlights = countOfFlights;
    this.type = type;
  }

  public int getFuelVolume() {
    return fuelVolume;
  }

  public int getFlightRange() {
    return flightRange;
  }

  public int getCountOfFlights() {
    return countOfFlights;
  }

  public String getType() {
    return type;
  }
}