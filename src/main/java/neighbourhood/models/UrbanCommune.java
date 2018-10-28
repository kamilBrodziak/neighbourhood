package neighbourhood.models;

import neighbourhood.models.containers.Cities;
import neighbourhood.models.containers.Delegacies;

import java.util.Map;

public class UrbanCommune extends Community{
    private Cities cities;
    private Delegacies delegacies;
    private String countyName;
    private String voivodeshipName;


    public UrbanCommune(Builder builder) {
        super(builder);
        this.countyName = builder._countyName;
        this.voivodeshipName = builder._voivodeshipName;
        cities = new Cities();
        delegacies = new Delegacies();
    }

    public Cities getCities() {
        return cities;
    }

    public Delegacies getDelegacies() { return delegacies; }

    public Map<String, City> getCityMap() {
        return cities.getCityMap();
    }

    public Map<String, Delegacy> getDelegacyMap() { return delegacies.getDelegacyMap(); }

    public void putCity(City city) {
        cities.putCity(city);
    }

    public void putDelegacy(Delegacy delegacy) { delegacies.putDelegacy(delegacy); }

}
