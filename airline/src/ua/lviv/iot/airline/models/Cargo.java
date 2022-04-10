package ua.lviv.iot.airline.models;

public class Cargo extends Plane {
  int weightOfCargo;
  int length;

  public Cargo(String model, int fuelVolume, int flightRange, int weightOfCargo, int length) {
    super(model, fuelVolume, flightRange);
    this.weightOfCargo = weightOfCargo;
    this.length = length;
  }

  @Override
  public String toString() {
    return String.format("Model: %s, Fuel volume: %d, Flight range: %d, Weight of cargo: %d, Length: %d",
            model, fuelVolume, flightRange, weightOfCargo, length);
  }
}
