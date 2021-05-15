package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class CameramanEquipment extends FilmEquipment {
    private double maxWorkload;
    private double maxHeight;

    CameramanEquipment() { }
    CameramanEquipment(final int amount, final double maxWorkload,
                       final double maxHeight) {
        super(amount);
        this.maxHeight = maxHeight;
        this.maxWorkload = maxWorkload;
    }
}
