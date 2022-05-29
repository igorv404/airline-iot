package ua.lviv.iot.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.airline.models.Cargo;
import ua.lviv.iot.airline.repository.CargoRepository;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class CargoService {
  private final CargoRepository cargoRepository;

  @Autowired
  public CargoService(CargoRepository cargoRepository) {
    this.cargoRepository = cargoRepository;
  }

  public void create(Cargo cargo) {
    cargoRepository.save(cargo);
  }

  public Collection<Cargo> getAll() {
    return cargoRepository.findAll();
  }

  public Object getById(Integer id) {
    return cargoRepository.findById(id);
  }

  @Transactional
  public void update(Integer id, String model) {
    Cargo cargo = cargoRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException("There is no cargo with " + id.toString() + " id"));
    cargo.setModel(model);
  }

  public void deleteById(Integer id) {
    cargoRepository.deleteById(id);
  }
}
