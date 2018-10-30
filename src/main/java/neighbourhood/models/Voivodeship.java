package neighbourhood.models;

import neighbourhood.models.containers.Counties;
import neighbourhood.models.containers.CountyCities;

import java.util.Map;

public class Voivodeship extends Community{
    private Counties counties;
    private CountyCities countyCities;

    public Voivodeship(Builder builder) {
        super(builder._name, CommunityEnum.VOIVODESHIP);
        counties = new Counties();
        countyCities = new CountyCities();
    }


    public Counties getCounties() {
        return counties;
    }

    public CountyCities getCountyCities() {
        return countyCities;
    }

    public Map<String, County> getCountyMap() {
        return counties.getCommunityMap();
    }

    public void putCounty(County county) {
        counties.putCommunity(county, county.getName());
    }

    public void putCountyCity(CountyCity countyCity) { countyCities.putCommunity(countyCity, countyCity.getName()); }

    public static class Builder implements IBuilder {
        private String _voivodeshipName;
        private String _countyName;
        private String _communeName;
        private String _name;
        private String _delegacyName;

        public Builder withVoivodeship(String voivodeshipName) {
            this._voivodeshipName = voivodeshipName;
            return this;
        }

        public Builder withCounty(String countyName) {
            this._countyName = countyName;
            return this;
        }


        public Builder withCommune(String communeName) {
            this._communeName = communeName;
            return this;
        }

        public Builder withDelegacy(String delegacyName) {
            this._delegacyName = delegacyName;
            return this;
        }

        @Override
        public Builder withName(String name) {
            this._name = name;
            return this;
        }

        @Override
        public Community createCommunity() {
            return new Voivodeship(this);
        }
    }
}
