package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.*;
import neighbourhood.models.containers.UrbVillCommunes;
import neighbourhood.models.containers.UrbanCommunes;
import neighbourhood.models.containers.VillageCommunes;

import java.util.Map;

public class CommuneController {
    private UrbanCommunes urbanCommunes;
    private UrbVillCommunes urbVIllCommunes;
    private VillageCommunes villageCommunes;

    public CommuneController() {
        urbanCommunes = new UrbanCommunes();
        urbVIllCommunes = new UrbVillCommunes();
        villageCommunes = new VillageCommunes();

    }

    public UrbanCommunes getUrbanCommunes() {
        return urbanCommunes;
    }

    public UrbVillCommunes getUrbVIllCommunes() {
        return urbVIllCommunes;
    }

    public VillageCommunes getVillageCommunes() {
        return villageCommunes;
    }


    public Map<String, UrbanCommune> getUrbanCommuneMap() {
        return urbanCommunes.getCommunityMap();
    }

    public Map<String, UrbVillCommune> getUrbVillCommuneMap() {
        return urbVIllCommunes.getCommunityMap();
    }

    public Map<String, VillageCommune> getVillageCommuneMap() {
        return villageCommunes.getCommunityMap();
    }

    public Community getCommuneByName(String name) {
        Community urb = villageCommunes.getCommunityByName(name);
        Community urbVill = urbVIllCommunes.getCommunityByName(name);
        Community vill = villageCommunes.getCommunityByName(name);
        if(urb != null) {
            return urb;
        } else if(urbVill != null) {
            return urbVill;
        } else if(vill != null) {
            return vill;
        }
        return null;
    }

    public int getUrbanCommuneCount() { return getUrbanCommuneMap().size(); }

    public int getUrbVillCommuneCount() { return getUrbVillCommuneMap().size(); }

    public int getVillageCommuneCount() { return getVillageCommuneMap().size(); }

    public void putCommune(Community commune) {
        if(commune.getPolyClassName().equals(UrbanCommune.class.getSimpleName())) {
            urbanCommunes.putCommunity((UrbanCommune)commune, commune.getName());
        } else if(commune.getPolyClassName().equals(UrbVillCommune.class.getSimpleName())) {
            urbVIllCommunes.putCommunity((UrbVillCommune)commune, commune.getName());
        } else if(commune.getPolyClassName().equals(VillageCommune.class.getSimpleName())) {
            villageCommunes.putCommunity((VillageCommune)commune, commune.getName());
        }
    }
}
