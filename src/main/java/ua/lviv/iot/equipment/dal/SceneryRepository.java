package ua.lviv.iot.equipment.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.equipment.models.Scenery;

@Repository
public interface SceneryRepository extends JpaRepository<Scenery, Integer> {
}
