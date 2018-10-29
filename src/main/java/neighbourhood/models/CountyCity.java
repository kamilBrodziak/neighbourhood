package neighbourhood.models;

import neighbourhood.models.containers.Communes;

import java.util.Map;

public class CountyCity extends Community {
    private String voivodeshipName;
    private Communes communes;



    public CountyCity(Builder builder) {
        super(builder._name);
        this.voivodeshipName = builder._voivodeshipName;
        communes = new Communes();
    }

    public Communes getCommunes() {
        return communes;
    }


    public Map<String, UrbanCommune> getUrbanCommuneMap() {
        return communes.getUrbanCommuneMap();
    }


    public void putUrbanCommune(UrbanCommune urbanCommune) {
        communes.putUrbanCommune(urbanCommune);
    }


    public String getVoivodeshipName() {
        return voivodeshipName;
    }

    public static class Builder implements IBuilder {
        private String _voivodeshipName;
        private String _name;

        public Builder withVoivodeship(String voivodeshipName) {
            this._voivodeshipName = voivodeshipName;
            return this;
        }

        @Override
        public Builder withName(String name) {
            this._name = name;
            return this;
        }

        @Override
        public Community createCommunity() {
            return new CountyCity(this);
        }
    }
}
