package ua.lviv.iot.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.airline.models.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
}
