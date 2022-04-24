package ua.lviv.iot.airline.managers.impl;

import ua.lviv.iot.airline.managers.IAirlineWriter;
import ua.lviv.iot.airline.models.Plane;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class AirlineWriter implements IAirlineWriter {

  @Override
  public void writeCSV(List<Plane> hangar) {
    String writerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "airline\\src\\main\\resources", File.separator, "result.csv");
    try (FileWriter writer = new FileWriter(writerResPath)) {
      String lastClassName = "";
      for (var plane : hangar) {
        if (!plane.getClass().getSimpleName().equals(lastClassName)) {
          writer.write(plane.getHeaders());
          writer.write("\n");
          lastClassName = plane.getClass().getSimpleName();
        }
        writer.write(plane.toCSV());
        writer.write("\n");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
