package neighbourhood.models.containers;

import neighbourhood.models.City;

import java.util.HashMap;
import java.util.Map;

public class Cities {
    public Map<String, City> cityMap;

    public Cities() {
        cityMap = new HashMap<String, City>();
    }

    public City getCityByName(String name) {
        if(cityMap.containsKey(name)) {
            return cityMap.get(name);
        }
        return null;
    }

    public Map<String, City> getCityMap() {
        return cityMap;
    }

    public void putCity(City city) {
        cityMap.put(city.getName(), city);
    }

}
