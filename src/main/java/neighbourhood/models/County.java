package neighbourhood.models;

import neighbourhood.models.containers.*;

import java.util.Map;

public class County extends Community{
    private Communes communes;
    private String voivodeship;

    public County(Builder builder) {
        super(builder);
        this.voivodeship = builder._voivodeship;
        communes = new Communes();
    }


    public Communes getCommunes() {
        return communes;
    }

    public Map<String, UrbanCommune> getUrbanCommuneMap() {
        return communes.getUrbanCommuneMap();
    }

    public Map<String, UrbVillCommune> getUrbVillCommuneMap() {
        return communes.getUrbVillCommuneMap();
    }

    public Map<String, VillageCommune> getVillageCommuneMap() {
        return communes.getVillageCommuneMap();
    }

    public void putUrbanCommune(UrbanCommune urbanCommune) {
        communes.putUrbanCommune(urbanCommune);
    }

    public void putUrbVillCommune(UrbVillCommune urbVillCommune) {
        communes.putUrbVillCommune(urbVillCommune);
    }

    public void putVillageCommune(VillageCommune villageCommune) {
        communes.putVillageCommune(villageCommune);
    }
}
