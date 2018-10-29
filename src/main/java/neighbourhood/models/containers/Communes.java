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
    static int idU = 0;
    static int idUV = 0;
    static int idV = 0;


    public Communes() {
        urbanCommuneMap = new HashMap<>();
        urbVillCommuneMap = new HashMap<>();
        villageCommuneMap = new HashMap<>();
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
        idU++;
        urbanCommuneMap.put(urbanCommune.getName() + idU, urbanCommune);
    }

    public void putUrbVillCommune(UrbVillCommune urbVillCommune) {
        idUV++;
        urbVillCommuneMap.put(urbVillCommune.getName() + idUV, urbVillCommune);
    }

    public void putVillageCommune(VillageCommune villageCommune) {
        idV++;
        villageCommuneMap.put(villageCommune.getName() + idV, villageCommune);
    }

    //MUST ADD ID TO NAME, NOT DONE
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
