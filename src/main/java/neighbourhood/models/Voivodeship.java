package neighbourhood.models;

import neighbourhood.models.containers.Counties;

import java.util.Map;

public class Voivodeship extends Community{
    private Counties counties;

    public Voivodeship(Builder builder) {
        super(builder);
        counties = new Counties();
    }

    public Counties getCounties() {
        return counties;
    }

    public Map<String, County> getCountyList() {
        return counties.getCountyMap();
    }

    public void putCounty(County county) {
        counties.putCounty(county);
    }



}
