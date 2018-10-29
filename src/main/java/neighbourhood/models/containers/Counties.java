package neighbourhood.models.containers;


import neighbourhood.models.County;

import java.util.HashMap;
import java.util.Map;

public class Counties {
    public Map<String, County> countyMap;
    static int id = 0;

    public Counties() {
        countyMap = new HashMap<>();
    }

    //MUST ADD ID TO NAME, NOT DONE
    public County getCountyByName(String name) {
        if(countyMap.containsKey(name)) {
            return countyMap.get(name);
        }
        return null;
    }

    public Map<String, County> getCountyMap() {
        return countyMap;
    }

    public void putCounty(County county) {
        id++;
        countyMap.put(county.getName() + id, county);
    }


}
