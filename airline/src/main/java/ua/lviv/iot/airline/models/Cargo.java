package ua.lviv.iot.airline.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
public class Cargo extends Plane {
  @Column(nullable = false)
  private Integer weightOfCargo;
  @Column(nullable = false)
  private Integer length;

  public Cargo(Integer id, String model, Integer fuelVolume, Integer flightRange, Integer countOfFlights, String type, Integer weightOfCargo, Integer length) {
    super(id, model, fuelVolume, flightRange, countOfFlights, type);
    this.weightOfCargo = weightOfCargo;
    this.length = length;
  }

  public Cargo() {
  }

  public Integer getWeightOfCargo() {
    return weightOfCargo;
  }

  public void setWeightOfCargo(Integer weightOfCargo) {
    this.weightOfCargo = weightOfCargo;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }
}
