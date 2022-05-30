package ua.lviv.iot.airline.models;

import javax.persistence.*;

@MappedSuperclass
public abstract class Plane {
  @Id
  @GeneratedValue
  private Integer id;
  @Column(nullable = false, columnDefinition = "TEXT")
  private String model;
  @Column(nullable = false)
  private Integer fuelVolume;
  @Column(nullable = false)
  private Integer flightRange;
  @Column(nullable = false)
  private Integer countOfFlights;
  @Column(nullable = false, columnDefinition = "TEXT")
  private String type;

  public Plane(Integer id, String model, Integer fuelVolume, Integer flightRange, Integer countOfFlights, String type) {
    this.id = id;
    this.model = model;
    this.fuelVolume = fuelVolume;
    this.flightRange = flightRange;
    this.countOfFlights = countOfFlights;
    this.type = type;
  }

  public Plane() {
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Integer getFuelVolume() {
    return fuelVolume;
  }

  public void setFuelVolume(Integer fuelVolume) {
    this.fuelVolume = fuelVolume;
  }

  public Integer getFlightRange() {
    return flightRange;
  }

  public void setFlightRange(Integer flightRange) {
    this.flightRange = flightRange;
  }

  public Integer getCountOfFlights() {
    return countOfFlights;
  }

  public void setCountOfFlights(Integer countOfFlights) {
    this.countOfFlights = countOfFlights;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getId() {
    return id;
  }
}
