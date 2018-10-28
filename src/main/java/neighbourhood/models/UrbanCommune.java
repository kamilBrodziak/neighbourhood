package neighbourhood.models;

import neighbourhood.models.containers.Cities;

import java.util.Map;

public class UrbanCommune extends Community{
    private Cities cities;
    private String county;
    private String voivodeship;


    public UrbanCommune(Builder builder) {
        super(builder);
        this.county = builder._county;
        this.voivodeship = builder._voivodeship;
        cities = new Cities();
    }

    public Cities getCities() {
        return cities;
    }

    public Map<String, City> getCityMap() {
        return cities.getCityMap();
    }

    public void putCity(City city) {
        cities.putCity(city);
    }

}
