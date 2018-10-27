package neighbourhood.models.containers;

import neighbourhood.models.Administration;

import java.util.HashMap;
import java.util.Map;

public class Voivodeships implements Administrations {
    public Map<Integer, Administration> voivodeshipMap;

    public Voivodeships() {
        voivodeshipMap = new HashMap<Integer, Administration>();
    }

    public Administration getAdministrationByID(int id) {
        return voivodeshipMap.get(id);
    }

    public Map<Integer, Administration> getAdministrationMap() {
        return voivodeshipMap;
    }

    public void putAdministration(Administration voivodeship) {
        voivodeshipMap.put(voivodeship.getId(), voivodeship);
    }
}
