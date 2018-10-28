package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.CountyCity;
import neighbourhood.models.containers.CountyCities;

import java.util.Map;

public class CountyCityController {
    private CountyCities countyCities;
    public CountyCityController() {
        this.countyCities = new CountyCities();
    }

    public CountyCities getCountyCities() {
        return countyCities;
    }

    public Map<String, CountyCity> getCountyCityMap() {
        return countyCities.getCountyCityMap();
    }

    public CountyCity getCountyCity(String name) {
        return countyCities.getCountyCityByName(name);
    }

    public void putCountyCity(CountyCity county) {
        countyCities.putCountyCity(county);
    }
}
