package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class Tripod extends CameramanEquipment {
    private int sectionsNumber;

    Tripod(final int amount, final double mawWorkload, final double maxHeight,
           final int sectionsNumber) {
        super(amount, mawWorkload, maxHeight);
        this.sectionsNumber = sectionsNumber;
    }
}
