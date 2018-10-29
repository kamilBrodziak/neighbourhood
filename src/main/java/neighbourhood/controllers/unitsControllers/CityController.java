package neighbourhood.controllers.unitsControllers;


import neighbourhood.models.City;
import neighbourhood.models.containers.Cities;

import java.util.Map;

public class CityController {
    Cities cities;

    public CityController() {
        cities = new Cities();
    }

    public Cities getCities() {
        return cities;
    }

    public Map<String, City> getCityMap() {
        return cities.getCityMap();
    }

    public City getCityByName(String name) {
        return cities.getCityByName(name);
    }

    public int getCityCount() { return getCityMap().size();}

    public void putCity(City city) {
        cities.putCity(city);
    }
}
