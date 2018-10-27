package neighbourhood.models;

import neighbourhood.models.containers.Villages;

import java.util.Map;

public class VillageCommune extends Commune {
    private Villages villages;

    public VillageCommune(String name, int id) {
        super(name, id);
        villages = new Villages();
    }

    public Villages getVillages() {
        return villages;
    }

    public Map<Integer, Settlement> getVillageMap() {
        return villages.getSettlementMap();
    }

    public void putVillage(Settlement village) {
        villages.putSettlement(village);
    }
}
