package neighbourhood.models.containers;

import neighbourhood.models.Commune;

import java.util.HashMap;
import java.util.Map;

public class UrbVillCommunes {
    private Map<Integer, Commune> urbVillCommuneMap;

    public UrbVillCommunes() {
        urbVillCommuneMap = new HashMap<Integer, Commune>();
    }

    public Commune getCommuneByID(int id) {
        return urbVillCommuneMap.get(id);
    }

    public void putCommune(Commune commune) {
        urbVillCommuneMap.put(commune.getID(), commune);
    }

    public Map<Integer, Commune> getCommuneMap() {
        return urbVillCommuneMap;
    }
}
