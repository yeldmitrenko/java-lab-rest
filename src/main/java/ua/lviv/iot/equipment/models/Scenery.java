package ua.lviv.iot.equipment.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)
@Table(name = "scenery")
public class Scenery extends FilmEquipment {


    private int price;
    private int installationTimeInDays;
    private String filmType;

    public Scenery(final int id, final int amount, final int price,
                   final int installationTimeInDays, final String filmType) {
        super(id, amount);
        this.price = price;
        this.installationTimeInDays = installationTimeInDays;
        this.filmType = filmType;
    }
}
