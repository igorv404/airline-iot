package ua.lviv.iot.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.airline.models.Airliner;
import ua.lviv.iot.airline.repository.AirlinerRepository;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class AirlinerService {

  private final AirlinerRepository airlinerRepository;

  @Autowired
  public AirlinerService(AirlinerRepository airlinerRepository) {
    this.airlinerRepository = airlinerRepository;
  }

  public void create(Airliner airliner) {
    airlinerRepository.save(airliner);
  }

  public Collection<Airliner> getAll() {
    return airlinerRepository.findAll();
  }

  public Object getById(Integer id) {
    return airlinerRepository.findById(id);
  }

  @Transactional
  public void update(Integer id, String model) {
    Airliner airliner = airlinerRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException("There is no cargo with " + id.toString() + " id"));
    airliner.setModel(model);
  }

  public void deleteById(Integer id) {
    airlinerRepository.deleteById(id);
  }
}
