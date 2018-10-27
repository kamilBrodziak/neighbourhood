package neighbourhood.models.containers;

import neighbourhood.models.Commune;

import java.util.HashMap;
import java.util.Map;

public class UrbanCommunes implements Communes{
    private Map<Integer, Commune> urbanCommuneMap;

    public UrbanCommunes() {
        urbanCommuneMap = new HashMap<Integer, Commune>();
    }

    public Commune getCommuneByID(int id) {
        return urbanCommuneMap.get(id);
    }

    public void putCommune(Commune commune) {
        urbanCommuneMap.put(commune.getID(), commune);
    }

    public Map<Integer, Commune> getCommuneMap() {
        return urbanCommuneMap;
    }
}
