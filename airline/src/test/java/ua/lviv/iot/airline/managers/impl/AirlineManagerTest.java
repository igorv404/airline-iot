package ua.lviv.iot.airline.managers.impl;

import ua.lviv.iot.airline.models.Airliner;
import ua.lviv.iot.airline.models.Cargo;
import ua.lviv.iot.airline.models.Plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AirlineManagerTest {
  private final AirlineManager airlineManager = new AirlineManager();
  private final List<Plane> hangar = new ArrayList<>();
  private final Cargo mriiya = new Cargo("Mriiya", 8000, 12000, 4000, "cargo", 1200, 250);
  private final Cargo an122 = new Cargo("an122", 2000, 10000, 11, "cargo", 1100, 200);
  private final Airliner boeing747 = new Airliner("Boeing 747", 5000, 12000, 10000, "airliner", 455);
  private final Airliner boeing777 = new Airliner("boeing 777", 10000, 111, 10000, "airliner", 555);

  @org.junit.jupiter.api.Test
  void addPlane() {
    int listSize = hangar.size();
    airlineManager.addPlane(hangar, mriiya);
    assertEquals(listSize + 1, hangar.size());
    assertNotEquals(hangar.get(hangar.size() - 1), null);
  }

  @org.junit.jupiter.api.Test
  void findPlaneByTypeSortByRange() {
    hangar.add(an122);
    hangar.add(mriiya);
    hangar.add(boeing747);
    hangar.add(boeing777);
    List<Plane> exml = Arrays.asList(mriiya, an122);
    assertEquals(2, airlineManager.findPlaneByTypeSortByRange(hangar, "cargo").size());
    assertEquals(exml, airlineManager.findPlaneByTypeSortByRange(hangar, "cargo"));
  }

  @org.junit.jupiter.api.Test
  void findPlaneByTypeSortByFuel() {
    hangar.add(an122);
    hangar.add(mriiya);
    hangar.add(boeing747);
    hangar.add(boeing777);
    List<Plane> exml = Arrays.asList(mriiya, an122);
    assertEquals(2, airlineManager.findPlaneByTypeSortByFuel(hangar, "cargo").size());
    assertEquals(exml, airlineManager.findPlaneByTypeSortByFuel(hangar, "cargo"));
  }

  @org.junit.jupiter.api.Test
  void findPlaneByTypeSortByFlights() {
    hangar.add(an122);
    hangar.add(mriiya);
    hangar.add(boeing747);
    hangar.add(boeing777);
    List<Plane> exml = Arrays.asList(mriiya, an122);
    assertEquals(2, airlineManager.findPlaneByTypeSortByFlights(hangar, "cargo").size());
    assertEquals(exml, airlineManager.findPlaneByTypeSortByFlights(hangar, "cargo"));
  }
}
