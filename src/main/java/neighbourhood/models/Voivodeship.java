package neighbourhood.models;

import neighbourhood.models.containers.Counties;
import neighbourhood.models.containers.CountyCities;

import java.util.Map;

public class Voivodeship extends Community{
    private Counties counties;
    private CountyCities countyCities;

    public Voivodeship(Builder builder) {
        super(builder);
        counties = new Counties();
    }

    public Counties getCounties() {
        return counties;
    }

    public CountyCities getCountyCities() {
        return countyCities;
    }

    public Map<String, County> getCountyList() {
        return counties.getCountyMap();
    }

    public void putCounty(County county) {
        counties.putCounty(county);
    }

    public void putCountyCity(CountyCity countyCity) { countyCities.putCountyCity(countyCity); }

}
