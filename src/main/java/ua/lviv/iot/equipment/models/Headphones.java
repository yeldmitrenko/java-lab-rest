package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class Headphones extends AudioEquipment {
    private HeadphonesType headphonesType;

    Headphones(final int amount, final String brand,
               final HeadphonesType headphonesType) {
        super(amount, brand);
        this.headphonesType = headphonesType;
    }
}
