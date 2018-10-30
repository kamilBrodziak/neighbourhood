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
        super(builder._name, CommunityEnum.URBANCOMMUNE);
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
        return cities.getCommunityMap();
    }

    public Map<String, Delegacy> getDelegacyMap() { return delegacies.getCommunityMap(); }

    public void putCity(City city) { cities.putCommunity(city, city.getName()); }

    public void putDelegacy(Delegacy delegacy) { delegacies.putCommunity(delegacy, delegacy.getName()); }

    public static class Builder implements IBuilder {
        private String _voivodeshipName;
        private String _countyName;
        private String _name;

        public Builder withVoivodeship(String voivodeshipName) {
            this._voivodeshipName = voivodeshipName;
            return this;
        }

        public Builder withCounty(String countyName) {
            this._countyName = countyName;
            return this;
        }

        @Override
        public Builder withName(String name) {
            this._name = name;
            return this;
        }

        @Override
        public Community createCommunity() {
            return new UrbanCommune(this);
        }
    }

}
