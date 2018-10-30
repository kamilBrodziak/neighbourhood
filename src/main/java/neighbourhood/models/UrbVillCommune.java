package neighbourhood.models;

import neighbourhood.models.containers.Cities;
import neighbourhood.models.containers.Villages;

import java.util.Map;

public class UrbVillCommune extends Community{
    private Cities cities;
    private Villages villages;
    private String countyName;
    private String voivodeshipName;



    public UrbVillCommune(Builder builder) {
        super(builder._name, CommunityEnum.URBVILLCOMMUNE);
        this.countyName = builder._countyName;
        this.voivodeshipName = builder._voivodeshipName;
        cities = new Cities();
        villages = new Villages();
    }


    public Cities getCities() {
        return cities;
    }

    public Villages getVillages() {
        return villages;
    }


    public Map<String, City> getCityList() {
        return cities.getCommunityMap();
    }

    public Map<String, Village> getVillageList() {
        return villages.getCommunityMap();
    }

    public void putCity(City city) {
        cities.putCommunity(city, city.getName());
    }

    public void putVillage(Village village) {
        villages.putCommunity(village, village.getName());
    }

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
            return new UrbVillCommune(this);
        }
    }
}
