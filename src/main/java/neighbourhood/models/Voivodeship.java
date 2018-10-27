package neighbourhood.models;

import neighbourhood.models.containers.Counties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Voivodeship extends Administration{
    private Counties counties;

    public Voivodeship(String name, int id) {
        super(name, id);
        counties = new Counties();
    }

    public Counties getCounties() {
        return counties;
    }

    public Map<Integer, Administration> getCountyMap() {
        return counties.getAdministrationMap();
    }

    public void putCounty(Administration county) {
        counties.putAdministration(county);
    }

}
