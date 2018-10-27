package neighbourhood.models;

import neighbourhood.models.containers.Cities;

import java.util.Map;

public class UrbanCommune extends Commune{
    private Cities cities;

    public UrbanCommune(String name, int id) {
        super(name, id);
        cities = new Cities();
    }

    public Cities getCities() {
        return cities;
    }

    public Map<Integer, Settlement> getCityMap() {
        return cities.getSettlementMap();
    }

    public void putCity(Settlement city) {
        cities.putSettlement(city);
    }
}
