package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.*;
import neighbourhood.models.containers.Communes;

import java.util.Map;

public class CommuneController {
    private Communes communes;

    public CommuneController() {
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

    public Community getCommuneByName(String name) {
        return communes.getCommuneByName(name);
    }

    public int getUrbanCommuneCount() { return getUrbanCommuneMap().size(); }

    public int getUrbVillCommuneCount() { return getUrbVillCommuneMap().size(); }

    public int getVillageCommuneCount() { return getVillageCommuneMap().size(); }

    public void putCommune(Community commune) {
        communes.putCommune(commune);
    }
}
