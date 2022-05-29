package ua.lviv.iot.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.airline.models.Airliner;

public interface AirlinerRepository extends JpaRepository<Airliner, Integer> {
}
