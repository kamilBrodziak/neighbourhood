package neighbourhood.models.containers;

import neighbourhood.models.Commune;

import java.util.HashMap;
import java.util.Map;

public class VillageCommunes {
    private Map<Integer, Commune> villageCommuneMap;

    public VillageCommunes() {
        villageCommuneMap = new HashMap<Integer, Commune>();
    }

    public Commune getCommuneByID(int id) {
        return villageCommuneMap.get(id);
    }

    public void putCommune(Commune commune) {
        villageCommuneMap.put(commune.getID(), commune);
    }

    public Map<Integer, Commune> getCommuneMap() {
        return villageCommuneMap;
    }
}
