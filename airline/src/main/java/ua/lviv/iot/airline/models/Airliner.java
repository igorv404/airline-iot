package ua.lviv.iot.airline.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "airliner")
public class Airliner extends Plane {
  @Column(nullable = false)
  private Integer numberOfPassengerSeats;

  public Airliner(String model, Integer fuelVolume, Integer flightRange, Integer countOfFlights, String type, Integer numberOfPassengerSeats) {
    super(model, fuelVolume, flightRange, countOfFlights, type);
    this.numberOfPassengerSeats = numberOfPassengerSeats;
  }

  public Airliner() {

  }

  public Integer getNumberOfPassengerSeats() {
    return numberOfPassengerSeats;
  }

  public void setNumberOfPassengerSeats(Integer numberOfPassengerSeats) {
    this.numberOfPassengerSeats = numberOfPassengerSeats;
  }
}
