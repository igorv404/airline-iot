package ua.lviv.iot.airline.models;

public class Airliner extends Plane {
  int numberOfPassengerSeats;

  public Airliner(String model, int fuelVolume, int flightRange, int numberOfPassengerSeats) {
    super(model, fuelVolume, flightRange);
    this.numberOfPassengerSeats = numberOfPassengerSeats;
  }

  @Override
  public String toString() {
    return String.format("Model: %s, Fuel volume: %d, Flight range: %d, Number of passenger seats: %d",
            model, fuelVolume, flightRange, numberOfPassengerSeats);
  }
}
