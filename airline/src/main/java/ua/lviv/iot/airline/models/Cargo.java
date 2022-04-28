package ua.lviv.iot.airline.models;

public class Cargo extends Plane {
  int weightOfCargo;
  int length;

  public Cargo(String model, int fuelVolume, int flightRange, int countOfFlights, String type, int weightOfCargo, int length) {
    super(model, fuelVolume, flightRange, countOfFlights, type);
    this.weightOfCargo = weightOfCargo;
    this.length = length;
  }

  public int getWeightOfCargo() {
    return weightOfCargo;
  }

  public int getLength() {
    return length;
  }

  @Override
  public String toString() {
    return String.format("Model: %s, Fuel volume: %d, Flight range: %d, Weight of cargo: %d, Length: %d",
            model, fuelVolume, flightRange, weightOfCargo, length);
  }

  @Override
  public String getHeaders() {
    return String.format("%s, %s", super.getHeaders(), "weightOfCargo, length");
  }

  @Override
  public String toCSV() {
    return String.format("%s, %s, %s", super.toCSV(), getWeightOfCargo(), getLength());
  }
}
