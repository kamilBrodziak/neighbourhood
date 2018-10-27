package neighbourhood.models;

import neighbourhood.models.containers.Cities;
import neighbourhood.models.containers.Villages;

import java.util.Map;

public class UrbVillCommune extends Commune {
    private Cities cities;
    private Villages villages;

    public UrbVillCommune(String name, int id) {
        super(name, id);
        cities = new Cities();
        villages = new Villages();
    }

    public Cities getCities() {
        return cities;
    }

    public Villages getVillages() {
        return villages;
    }

    public Map<Integer, Settlement> getCityMap() {
        return cities.getSettlementMap();
    }

    public Map<Integer, Settlement> getVillageMap() {
        return villages.getSettlementMap();
    }

    public void putCity(Settlement city) {
        cities.putSettlement(city);
    }

    public void putVillage(Settlement village) {
        villages.putSettlement(village);
    }

}
