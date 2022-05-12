package ua.lviv.iot.airline;

import ua.lviv.iot.airline.managers.impl.AirlineManager;
import ua.lviv.iot.airline.managers.impl.AirlineWriter;
import ua.lviv.iot.airline.managers.impl.Searcher;
import ua.lviv.iot.airline.models.Airliner;
import ua.lviv.iot.airline.models.Airport;
import ua.lviv.iot.airline.models.Cargo;
import ua.lviv.iot.airline.models.Plane;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    AirlineManager turkish = new AirlineManager();

    Airport halytskiy = new Airport("halytskiy", "Lviv");

    Cargo mriiya = new Cargo("Mriiya", 8000, 12000, 4000, "cargo", 1200, 250);
    Cargo an122 = new Cargo("an122", 2000, 10000, 11, "cargo", 1100, 200);
    Cargo an222 = new Cargo("an222", 6000, 11000, 10000, "cargo", 2000, 350);
    Cargo an432 = new Cargo("an432", 10000, 15000, 100, "cargo", 4200, 650);

    Airliner boeing747 = new Airliner("Boeing 747", 5000, 12000, 10000, "airliner", 455);
    Airliner boeing777 = new Airliner("boeing 777", 10000, 111, 10000, "airliner", 555);
    Airliner boeing767 = new Airliner("boeing 767", 8000, 25, 20000, "airliner", 955);
    Airliner boeing757 = new Airliner("boeing 757", 7500, 45, 25000, "airliner", 450);

    List<Plane> hangar = new ArrayList<>();

    turkish.addPlane(hangar, mriiya);
    turkish.addPlane(hangar, an122);
    turkish.addPlane(hangar, an222);
    turkish.addPlane(hangar, an432);
    turkish.addPlane(hangar, boeing747);
    turkish.addPlane(hangar, boeing777);
    turkish.addPlane(hangar, boeing767);
    turkish.addPlane(hangar, boeing757);

    AirlineWriter table = new AirlineWriter();

    table.writeCSV(hangar);

    String txt = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras semper libero non orci maximus, non laoreet massa varius." +
            " Sed consequat metus id felis mollis ullamcorper vitae id ligula. Aliquam rhoncus at justo sed viverra." +
            " Mauris eleifend ante eget urna varius, in rutrum augue ullamcorper. Nunc est risus, aliquam at tortor eu, fermentum lobortis mi." +
            " Nulla vehicula, erat quis fermentum mattis, ligula massa viverra est, quis auctor lorem massa quis metus. Nunc sed facilisis dolor." +
            " Aenean nec dignissim mauris. Donec eu ornare nunc.";

    Searcher searcher = new Searcher();

    System.out.println(searcher.findRightWords(txt, 4));
  }
}
