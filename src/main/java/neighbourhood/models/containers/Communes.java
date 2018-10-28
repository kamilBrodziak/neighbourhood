package neighbourhood.models.containers;

import neighbourhood.models.Community;
import neighbourhood.models.UrbVillCommune;
import neighbourhood.models.UrbanCommune;
import neighbourhood.models.VillageCommune;

import java.util.HashMap;
import java.util.Map;

public class Communes {
    private Map<String, UrbanCommune> urbanCommuneMap;
    private Map<String, UrbVillCommune> urbVillCommuneMap;
    private Map<String, VillageCommune> villageCommuneMap;

    public Communes() {
        urbanCommuneMap = new HashMap<String, UrbanCommune>();
        urbVillCommuneMap = new HashMap<String, UrbVillCommune>();
        villageCommuneMap = new HashMap<String, VillageCommune>();
    }

    public void putCommune(Community commune) {
        if(commune instanceof UrbanCommune) {
            putUrbanCommune((UrbanCommune)commune);
        } else if(commune instanceof UrbVillCommune) {
            putUrbVillCommune((UrbVillCommune)commune);
        } else if(commune instanceof VillageCommune) {
            putVillageCommune((VillageCommune)commune);
        }
    }

    public void putUrbanCommune(UrbanCommune urbanCommune) {
        urbanCommuneMap.put(urbanCommune.getName(), urbanCommune);
    }

    public void putUrbVillCommune(UrbVillCommune urbVillCommune) {
        urbVillCommuneMap.put(urbVillCommune.getName(), urbVillCommune);
    }

    public void putVillageCommune(VillageCommune villageCommune) {
        villageCommuneMap.put(villageCommune.getName(), villageCommune);
    }

    public Community getCommuneByName(String name) {
        if(urbanCommuneMap.containsKey(name)) {
            return urbanCommuneMap.get(name);
        } else if(urbVillCommuneMap.containsKey(name)) {
            return urbVillCommuneMap.get(name);
        } else if(villageCommuneMap.containsKey(name)) {
            return villageCommuneMap.get(name);
        }
        return null;
    }

    public Map<String, UrbanCommune> getUrbanCommuneMap() {
        return urbanCommuneMap;
    }

    public Map<String, UrbVillCommune> getUrbVillCommuneMap() {
        return urbVillCommuneMap;
    }

    public Map<String, VillageCommune> getVillageCommuneMap() {
        return villageCommuneMap;
    }
}
