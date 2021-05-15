package ua.lviv.iot.equipment.models;

import lombok.Data;

@Data
public class Microphone extends AudioEquipment {
    private MicrophoneType microphoneType;

    Microphone(final int amount, final String brand,
               final MicrophoneType microphoneType) {
        super(amount, brand);
        this.microphoneType = microphoneType;
    }
}
