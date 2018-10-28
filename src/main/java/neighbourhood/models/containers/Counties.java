package neighbourhood.models.containers;


import neighbourhood.models.County;
import neighbourhood.models.Village;

import java.util.HashMap;
import java.util.Map;

public class Counties {
    public Map<String, County> countyMap;

    public Counties() {
        countyMap = new HashMap<String, County>();
    }

    public Map<String, County> getCountyMap() {
        return countyMap;
    }

    public County getCountyByName(String name) {
        if(countyMap.containsKey(name)) {
            return countyMap.get(name);
        }
        return null;
    }
    public void putCounty(County county) {
        countyMap.put(county.getName(), county);
    }
}
