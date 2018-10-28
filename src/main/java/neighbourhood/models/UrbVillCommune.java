package neighbourhood.models;

import neighbourhood.models.containers.Cities;
import neighbourhood.models.containers.Villages;

import java.util.Map;

public class UrbVillCommune extends Community {
    private Cities cities;
    private Villages villages;
    private String county;
    private String voivodeship;


    public UrbVillCommune(Builder builder) {
        super(builder);
        this.county = builder._county;
        this.voivodeship = builder._voivodeship;
        cities = new Cities();
        villages = new Villages();
    }

    public Cities getCities() {
        return cities;
    }

    public Villages getVillages() {
        return villages;
    }


    public Map<String, City> getCityList() {
        return cities.getCityMap();
    }

    public Map<String, Village> getVillageList() {
        return villages.getVillageMap();
    }

    public void putCity(City city) {
        cities.putCity(city);
    }

    public void putVillage(Village village) {
        villages.putVillage(village);
    }
}
