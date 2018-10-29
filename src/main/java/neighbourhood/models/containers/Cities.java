package neighbourhood.models.containers;

import neighbourhood.models.City;

import java.util.HashMap;
import java.util.Map;

public class Cities {
    public Map<String, City> cityMap;
    static int id = 0;

    public Cities() {
        cityMap = new HashMap<>();
    }

    //MUST ADD ID TO NAME, NOT DONE
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
        id++;
        cityMap.put(city.getName() + id, city);
    }

    public void putCity(String name, City city) {
        cityMap.put(name, city);
    }


}
