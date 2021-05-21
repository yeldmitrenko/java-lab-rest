package ua.lviv.iot.equipment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tripod extends CameramanEquipment {
    private int sectionsNumber;
}
