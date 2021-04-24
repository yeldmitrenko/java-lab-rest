package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class RailSystem extends CameramanEquipment {
    private double roadLength;

    RailSystem(final int amount, final double maxWorkload,
               final double maxHeight, final double roadLength) {
        super(amount, maxWorkload, maxHeight);
        this.roadLength = roadLength;
    }
}
