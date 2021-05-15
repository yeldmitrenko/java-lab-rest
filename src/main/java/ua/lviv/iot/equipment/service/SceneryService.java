package ua.lviv.iot.equipment.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.equipment.models.Scenery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@ApplicationScope
public class SceneryService {

    private final AtomicInteger id = new AtomicInteger(0);
    private final Map<Integer, Scenery> sceneryMap = new HashMap<Integer, Scenery>();

    public Scenery addScenery(final Scenery scenery) {
        int sceneryId = id.incrementAndGet();
        scenery.setId(sceneryId);
        sceneryMap.put(sceneryId, scenery);
        return scenery;
    }

    public Scenery updateScenery(final Scenery scenery) {
        return sceneryMap.put(scenery.getId(), scenery);
    }

    public List<Scenery> getAllScenery() {
        return new ArrayList<>(sceneryMap.values());
    }

    public Scenery getScenery(final Integer id) {
        return sceneryMap.get(id);
    }

    public Scenery deleteScenery(final Integer id) {
        return sceneryMap.remove(id);
    }
}
