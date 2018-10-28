package neighbourhood.models.containers;

import neighbourhood.models.Village;

import java.util.HashMap;
import java.util.Map;

public class Villages {
    public Map<String, Village> villageMap;

    public Villages() {
        villageMap = new HashMap<String, Village>();
    }

    public Map<String, Village> getVillageMap() {
        return villageMap;
    }

    public Village getVillageByName(String name) {
        if (villageMap.containsKey(name)) {
            return villageMap.get(name);
        }
        return null;
    }
    public void putVillage(Village village) {
        villageMap.put(village.getName(), village);
    }

}