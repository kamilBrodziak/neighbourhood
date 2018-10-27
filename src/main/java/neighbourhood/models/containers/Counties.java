package neighbourhood.models.containers;


import neighbourhood.models.Administration;

import java.util.HashMap;
import java.util.Map;

public class Counties implements Administrations {
    public Map<Integer, Administration> countyMap;

    public Counties() {
        countyMap = new HashMap<Integer, Administration>();
    }

    public Administration getAdministrationByID(int id) {
        return countyMap.get(id);
    }

    public Map<Integer, Administration> getAdministrationMap() {
        return countyMap;
    }

    public void putAdministration(Administration county) {
        countyMap.put(county.getId(), county);
    }
}
