package neighbourhood.models;

import neighbourhood.models.containers.Villages;

import java.util.Map;

public class VillageCommune extends Community{
    private Villages villages;
    private String county;
    private String voivodeship;


    public VillageCommune(Builder builder) {
        super(builder);
        this.county = builder._county;
        this.voivodeship = builder._voivodeship;
        villages = new Villages();
    }

    public Villages getVillages() {
        return villages;
    }

    public Map<String, Village> getVillageList() {
        return villages.getVillageMap();
    }

    public void putVillage(Village village) {
        villages.putVillage(village);
    }
}
