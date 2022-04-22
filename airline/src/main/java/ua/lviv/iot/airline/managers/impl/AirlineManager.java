package ua.lviv.iot.airline.managers.impl;

import ua.lviv.iot.airline.managers.IAirlineManager;
import ua.lviv.iot.airline.models.Plane;

import java.util.List;
import java.util.Objects;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AirlineManager implements IAirlineManager {

  @Override
  public void addPlane(List<Plane> hangar, Plane plane) {
    hangar.add(plane);
  }

  @Override
  public List<Plane> findPlaneByTypeSortByRange(List<Plane> hangar, String type) {
    return hangar.stream()
            .filter(plane -> Objects.equals(plane.getType(), type))
            .sorted(Comparator.comparing(Plane::getFlightRange).reversed())
            .collect(Collectors.toList());
  }

  @Override
  public List<Plane> findPlaneByTypeSortByFuel(List<Plane> hangar, String type) {
    return hangar.stream()
            .filter(plane -> Objects.equals(plane.getType(), type))
            .sorted(Comparator.comparing(Plane::getFuelVolume).reversed())
            .collect(Collectors.toList());
  }

  @Override
  public List<Plane> findPlaneByTypeSortByFlights(List<Plane> hangar, String type) {
    return hangar.stream()
            .filter(plane -> Objects.equals(plane.getType(), type))
            .sorted(Comparator.comparing(Plane::getCountOfFlights).reversed())
            .collect(Collectors.toList());
  }
}
