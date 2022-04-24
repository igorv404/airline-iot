package ua.lviv.iot.airline.models;

public class Airliner extends Plane {
  int numberOfPassengerSeats;

  public Airliner(String model, int fuelVolume, int flightRange, int countOfFlights, String type, int numberOfPassengerSeats) {
    super(model, fuelVolume, flightRange, countOfFlights, type);
    this.numberOfPassengerSeats = numberOfPassengerSeats;
  }

  public int getNumberOfPassengerSeats() {
    return numberOfPassengerSeats;
  }

  @Override
  public String toString() {
    return String.format("Model: %s, Fuel volume: %d, Flight range: %d, Number of passenger seats: %d",
            model, fuelVolume, flightRange, numberOfPassengerSeats);
  }

  @Override
  public String getHeaders() {
    return String.format("%s, %s", super.getHeaders(), "numberOfPassengerSeats");
  }

  @Override
  public String toCSV() {
    return String.format("%s, %s", super.toCSV(), getNumberOfPassengerSeats());
  }
}
