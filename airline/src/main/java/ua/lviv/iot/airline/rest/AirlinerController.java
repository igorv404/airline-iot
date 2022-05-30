package ua.lviv.iot.airline.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.airline.models.Airliner;
import ua.lviv.iot.airline.services.AirlinerService;

import java.util.Collection;

@RestController
@RequestMapping("/airliner")
public class AirlinerController {

  private final AirlinerService airlinerService;

  @Autowired
  public AirlinerController(AirlinerService airlinerService) {
    this.airlinerService = airlinerService;
  }

  @PostMapping("/create")
  private void create(@RequestBody Airliner airliner) {
    airlinerService.create(airliner);
  }

  @GetMapping
  private Collection<Airliner> getAll() {
    return airlinerService.getAll();
  }

  @GetMapping("/{id}")
  private Airliner getById(@PathVariable("id") Integer id) {
    return airlinerService.getById(id);
  }

  @PutMapping("/update/{id}")
  void update(@PathVariable("id") Integer id, String model) {
    airlinerService.update(id, model);
  }

  @DeleteMapping("/delete/{id}")
  private void delete(@PathVariable("id") Integer id) {
    airlinerService.deleteById(id);
  }
}
