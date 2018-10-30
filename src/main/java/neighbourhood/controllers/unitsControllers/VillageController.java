package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.Village;
import neighbourhood.models.containers.Villages;

import java.util.Map;

public class VillageController {
    Villages villages;

    public VillageController() {
        villages = new Villages();
    }

    public Villages getVillages() {
        return villages;
    }

    public Map<String, Village> getVillageMap() {
        return villages.getCommunityMap();
    }

    public Village getVillageByName(String name) {
        return villages.getCommunityByName(name);
    }

    public int getVillageCount() { return getVillageMap().size();}

    public void putVillage(Village village) {
        villages.putCommunity(village, village.getName());
    }
}
