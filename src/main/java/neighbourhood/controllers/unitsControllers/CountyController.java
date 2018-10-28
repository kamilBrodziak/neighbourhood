package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.County;
import neighbourhood.models.containers.Counties;

import java.util.Map;

public class CountyController {
    private Counties counties;
    public CountyController() {
        this.counties = new Counties();
    }

    public Counties getCounties() {
        return counties;
    }

    public Map<String, County> getCountyMap() {
        return counties.getCountyMap();
    }

    public County getCounty(String name) {
        return counties.getCountyByName(name);
    }

    public void putCounty(County county) {
        counties.putCounty(county);
    }
}
