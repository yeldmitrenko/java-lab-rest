package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class AudioEquipment extends FilmEquipment {
    private String brand;

    AudioEquipment() { }
    public AudioEquipment(final int amount, final String brand) {
        super(amount);
        this.brand = brand;
    }
}
