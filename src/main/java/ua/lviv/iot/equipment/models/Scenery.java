package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class Scenery extends FilmEquipment {
    private int price;
    private int installationTimeInDays;
    private FilmType filmType;

    public Scenery(final int amount, final int price,
                   final int installationTimeInDays, final FilmType filmType) {
        super(amount);
        this.price = price;
        this.installationTimeInDays = installationTimeInDays;
        this.filmType = filmType;
    }
}
