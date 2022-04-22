package ua.lviv.iot.airline.managers;

import ua.lviv.iot.airline.models.Plane;

import java.util.List;

public interface IAirlineManager {
  void addPlane(List<Plane> hangar, Plane plane);

  List<Plane> findPlaneByTypeSortByRange(List<Plane> hangar, String type);

  List<Plane> findPlaneByTypeSortByFuel(List<Plane> hangar, String type);

  List<Plane> findPlaneByTypeSortByFlights(List<Plane> hangar, String type);
}
