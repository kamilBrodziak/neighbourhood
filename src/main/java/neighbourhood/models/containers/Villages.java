package neighbourhood.models.containers;

import neighbourhood.models.Village;

import java.util.HashMap;
import java.util.Map;

public class Villages {
    public Map<String, Village> villageMap;
    private static int id = 0;


    public Villages() {
        villageMap = new HashMap<>();
    }

    public Map<String, Village> getVillageMap() {
        return villageMap;
    }

    //MUST ADD ID TO NAME, NOT DONE
    public Village getVillageByName(String name) {
        if (villageMap.containsKey(name)) {
            return villageMap.get(name);
        }
        return null;
    }
    public void putVillage(Village village) {
        id++;
        villageMap.put(village.getName(), village);
    }


}