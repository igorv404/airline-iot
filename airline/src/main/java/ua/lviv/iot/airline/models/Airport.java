package ua.lviv.iot.airline.models;

public class Airport {
  String name;
  String location;

  public Airport(String name, String location) {
    this.name = name;
    this.location = location;
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Location: %s", name, location);
  }
}
