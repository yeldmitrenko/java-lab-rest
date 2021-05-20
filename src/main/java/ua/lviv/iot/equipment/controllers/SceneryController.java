package ua.lviv.iot.equipment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.equipment.models.Scenery;
import ua.lviv.iot.equipment.service.SceneryService;

import java.util.List;

@RestController
@RequestMapping(path = "/scenery")
public class SceneryController {

    @Autowired
    private SceneryService sceneryService;

    @GetMapping(path = "/{id}")
    public Object getScenery(@PathVariable(name = "id") final Integer id) {
        if (sceneryService.getScenery(id) != null) {
            return sceneryService.getScenery(id);
        } else {
            return new ResponseEntity<Scenery>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public  List<Scenery> getAllScenery() {
        return sceneryService.getAllScenery();
    }

    @PostMapping()
    public Scenery createScenery(@RequestBody final Scenery scenery) {
        return sceneryService.addScenery(scenery);
    }

    @PutMapping()
    public Object updateScenery(@RequestBody final Scenery scenery) {
        if (sceneryService.getScenery(scenery.getId()) != null) {
            return new ResponseEntity<Scenery>(sceneryService
                    .updateScenery(scenery), HttpStatus.OK);
        } else {
            return new ResponseEntity<Scenery>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public Object deleteScenery(@PathVariable(name = "id") final Integer id) {
        if (sceneryService.getScenery(id) != null) {
            return sceneryService.deleteScenery(id);
        } else {
            return new ResponseEntity<Scenery>(HttpStatus.NOT_FOUND);
        }
    }
}
