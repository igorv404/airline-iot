package ua.lviv.iot.airline.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.airline.models.Cargo;
import ua.lviv.iot.airline.services.CargoService;

import java.util.Collection;

@RestController
@RequestMapping("/cargo")
public class CargoController {
  private final CargoService cargoService;

  @Autowired
  public CargoController(CargoService cargoService) {
    this.cargoService = cargoService;
  }

  @PostMapping("/create")
  private void create(@RequestBody Cargo cargo) {
    cargoService.create(cargo);
  }

  @GetMapping
  private Collection<Cargo> getAll() {
    return cargoService.getAll();
  }

  @GetMapping("/{id}")
  private Object getById(@PathVariable("id") Integer id) {
    return cargoService.getById(id);
  }

  @PutMapping("/update/{id}")
  void update(@PathVariable("id") Integer id, String model) {
    cargoService.update(id, model);
  }

  @DeleteMapping("/delete/{id}")
  private void delete(@PathVariable("id") Integer id) {
    cargoService.deleteById(id);
  }
}
