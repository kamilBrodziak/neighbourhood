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

    public void putCommune(Commune urbanCommune) {
        urbanCommuneMap.put(urbanCommune.getID(), urbanCommune);
    }

    public Map<Integer, Commune> getCommuneMap() {
        return urbanCommuneMap;
    }
}
