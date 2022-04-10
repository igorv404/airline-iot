package ua.lviv.iot.airline;

import ua.lviv.iot.airline.models.Airliner;
import ua.lviv.iot.airline.models.Airport;
import ua.lviv.iot.airline.models.Cargo;

public class Main {
  public static void main (String[] args) {
    Airport halytskiy = new Airport("halytskiy", "Lviv");
    Cargo mriiya = new Cargo("Mriiya", 8000, 12000, 1200, 250);
    Airliner boeing747 = new Airliner("Boeing 747", 5000, 12000, 455);
    System.out.println(halytskiy);
    System.out.println(mriiya);
    System.out.println(boeing747);
  }
}
