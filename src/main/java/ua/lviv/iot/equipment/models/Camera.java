package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class Camera extends FilmEquipment {
    private int weightInGrams;
    private int zoom;
    private int resolution;

    Camera(final int amount, final int weightInGrams, final int zoom,
           final int resolution) {
        super(amount);
        this.weightInGrams = weightInGrams;
        this.zoom = zoom;
        this.resolution = resolution;
    }
}
