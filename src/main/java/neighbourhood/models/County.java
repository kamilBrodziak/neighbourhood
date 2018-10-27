package neighbourhood.models;

import neighbourhood.models.containers.*;

import java.util.Map;

public class County extends Administration{
    private UrbanCommunes urbanCommunes;
    private UrbVillCommunes urbVillCommunes;
    private VillageCommunes villageCommunes;

    public County(String name, int id) {
        super(name, id);
        urbanCommunes = new UrbanCommunes();
        urbVillCommunes = new UrbVillCommunes();
        villageCommunes = new VillageCommunes();
    }

    public UrbanCommunes getUrbanCommunes() {
        return urbanCommunes;
    }

    public UrbVillCommunes getUrbVillCommunes() {
        return urbVillCommunes;
    }

    public VillageCommunes getVillageCommunes() {
        return villageCommunes;
    }

    public Map<Integer, Commune> getUrbanCommuneMap() {
        return urbanCommunes.getCommuneMap();
    }

    public Map<Integer, Commune> getUrbVillCommuneMap() {
        return urbVillCommunes.getCommuneMap();
    }

    public Map<Integer, Commune> getVillageCommuneMap() {
        return villageCommunes.getCommuneMap();
    }

    public void putUrbanCommune(Commune urbanCommune) {
        urbanCommunes.putCommune(urbanCommune);
    }

    public void putUrbVillCommune(Commune urbVillCommune) {
        urbVillCommunes.putCommune(urbVillCommune);
    }

    public void putVillageCommune(Commune villageCommune) {
        villageCommunes.putCommune(villageCommune);
    }
}
