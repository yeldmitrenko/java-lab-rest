package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class FilmEquipment {
    private int amount;
    FilmEquipment() { }
    FilmEquipment(final int amount) {
        this.amount = amount;
    }
}
