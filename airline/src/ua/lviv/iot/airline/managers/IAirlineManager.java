package ua.lviv.iot.airline.managers;

import ua.lviv.iot.airline.models.Plane;

import java.util.List;

public interface IAirlineManager {
  void addPlane(Plane plane);

  List<Plane> findPlaneByTypeSortByRange(String type);

  List<Plane> findPlaneByTypeSortByFuel(String type);

  List<Plane> findPlaneByTypeSortByFlights(String type);
}
