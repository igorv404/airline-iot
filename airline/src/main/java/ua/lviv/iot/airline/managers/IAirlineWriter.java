package ua.lviv.iot.airline.managers;

import ua.lviv.iot.airline.models.Plane;

import java.util.List;

public interface IAirlineWriter {
  void writeCSV(List<Plane> hangar);
}
