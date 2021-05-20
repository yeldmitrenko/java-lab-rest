package ua.lviv.iot.equipment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.equipment.dal.SceneryRepository;
import ua.lviv.iot.equipment.models.Scenery;

import java.util.List;

@Service
@ApplicationScope
public class SceneryService {

    @Autowired
    private SceneryRepository sceneryRepository;

    public Scenery addScenery(final Scenery scenery) {
        sceneryRepository.save(scenery);
        return scenery;
    }

    public Scenery updateScenery(final Scenery scenery) {
        sceneryRepository.save(scenery);
        return scenery;
    }

    public List<Scenery> getAllScenery() {
        return (List<Scenery>) sceneryRepository.findAll();
    }

    public Scenery getScenery(final Integer id) {
        return sceneryRepository.findById(id).orElse(null);
    }

    public Scenery deleteScenery(final Integer id) {
        Scenery scenery = sceneryRepository.findById(id).orElse(null);
        sceneryRepository.deleteById(id);
        return scenery;
    }
}
