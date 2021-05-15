package ua.lviv.iot.equipment.manager;

import lombok.Data;
import ua.lviv.iot.equipment.models.Scenery;
import ua.lviv.iot.equipment.models.FilmType;
import ua.lviv.iot.equipment.models.SortOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class EquipmentManager {
    private List<Scenery> equipment = new ArrayList<Scenery>();

    public void addScenery(final List<Scenery> equipment) {

        this.equipment.addAll(equipment);
    }

    public void addScenery(final Scenery item) {

        this.equipment.add(item);
    }

    public void searchByFilmType(final FilmType filmType) {
        equipment = equipment.stream().filter(item ->
                item.getFilmType().equals(filmType))
                .collect(Collectors.toList());
    }

    public void sortByPrice(final SortOrder order) {
        if (order == SortOrder.ASC) {
            this.equipment.sort((Scenery firstItem, Scenery secondItem) ->
                    firstItem.getPrice() - secondItem.getPrice());
        } else {
            this.equipment.sort((Scenery firstItem, Scenery secondItem) ->
                    secondItem.getPrice() - firstItem.getPrice());
        }
    }

    public void sortByInstallationTimeInDays(final SortOrder order) {
        if (order == SortOrder.ASC) {
            this.equipment.sort((Scenery firstItem, Scenery secondItem) ->
                    firstItem.getInstallationTimeInDays()
                            - secondItem.getInstallationTimeInDays());
        } else {
            this.equipment.sort((Scenery firstItem, Scenery secondItem) ->
                    secondItem.getInstallationTimeInDays()
                            - firstItem.getInstallationTimeInDays());
        }
    }

    public void printEquipment() {
        for (Scenery item: equipment) {
            System.out.println("---------");
            System.out.println(item);
            System.out.println("amount: " + item.getAmount());
            System.out.println("price: " + item.getPrice());
            System.out.println("installation time in days: "
                    + item.getInstallationTimeInDays());
            System.out.println("film type: " + item.getFilmType());
            System.out.println("---------");
        }
    }
}
