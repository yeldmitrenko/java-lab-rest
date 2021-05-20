package ua.lviv.iot.equipment;

import ua.lviv.iot.equipment.manager.EquipmentManager;
import ua.lviv.iot.equipment.models.Scenery;
import ua.lviv.iot.equipment.models.FilmType;
import ua.lviv.iot.equipment.models.SortOrder;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(final String[] args) {
        EquipmentManager manager = new EquipmentManager();
        List<Scenery> equipment = new ArrayList<Scenery>();

        equipment.add(new Scenery(1, 2, 56, 28, "HISTORICAL"));
        equipment.add(new Scenery(2, 3, 12, 3, "DOCUMENTARY"));
        equipment.add(new Scenery(3, 6, 221, 64, "HISTORICAL"));

        manager.addScenery(equipment);

        System.out.println("All equipment: ");

        manager.printEquipment();

        System.out.println("Only for historical film: ");

        manager.searchByFilmType(FilmType.HISTORICAL);
        manager.printEquipment();

        System.out.println("Sorted by price: ");

        manager.sortByPrice(SortOrder.ASC);
        manager.printEquipment();

        System.out.println("Sorted by installation time: ");

        manager.sortByInstallationTimeInDays(SortOrder.DESC);
        manager.printEquipment();
    }
}
