package ua.lviv.iot.equipment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scenery extends FilmEquipment {
    private int id;
    private int price;
    private int installationTimeInDays;
    private String filmType;
}
