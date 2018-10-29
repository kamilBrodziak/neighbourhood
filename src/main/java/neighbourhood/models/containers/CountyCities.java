package neighbourhood.models.containers;

import neighbourhood.models.CountyCity;

import java.util.HashMap;
import java.util.Map;

public class CountyCities {
    public Map<String, CountyCity> countyCityMap;
    private static int id = 0;

    public CountyCities() {
        countyCityMap = new HashMap<>();
    }

    public Map<String, CountyCity> getCountyCityMap() {
        return countyCityMap;
    }

    //MUST ADD ID TO NAME, NOT DONE
    public CountyCity getCountyCityByName(String name) {
        if(countyCityMap.containsKey(name)) {
            return countyCityMap.get(name);
        }
        return null;
    }
    public void putCountyCity(CountyCity countyCity) {
        id++;
        countyCityMap.put(countyCity.getName() + id, countyCity);
    }

}
