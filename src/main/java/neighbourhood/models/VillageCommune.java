package neighbourhood.models;

import neighbourhood.models.containers.Villages;

import java.util.Map;

public class VillageCommune extends Community{
    private Villages villages;
    private String countyName;
    private String voivodeshipName;


    public VillageCommune(Builder builder) {
        super(builder);
        this.countyName = builder._countyName;
        this.voivodeshipName = builder._voivodeshipName;
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
