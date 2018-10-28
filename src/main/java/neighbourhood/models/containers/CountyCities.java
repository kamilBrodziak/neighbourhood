package neighbourhood.models.containers;

import neighbourhood.models.CountyCity;

import java.util.HashMap;
import java.util.Map;

public class CountyCities {
    public Map<String, CountyCity> countyCityMap;

    public CountyCities() {
        countyCityMap = new HashMap<String, CountyCity>();
    }

    public Map<String, CountyCity> getCountyCityMap() {
        return countyCityMap;
    }

    public CountyCity getCountyCityByName(String name) {
        if(countyCityMap.containsKey(name)) {
            return countyCityMap.get(name);
        }
        return null;
    }
    public void putCountyCity(CountyCity countyCity) {
        countyCityMap.put(countyCity.getName(), countyCity);
    }
}
