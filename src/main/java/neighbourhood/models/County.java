package neighbourhood.models;

import neighbourhood.models.containers.*;

import java.util.Map;

public class County extends Community{
    private Communes communes;
    private String voivodeshipName;

    public County(Builder builder) {
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

    public Map<String, UrbVillCommune> getUrbVillCommuneMap() {
        return communes.getUrbVillCommuneMap();
    }

    public Map<String, VillageCommune> getVillageCommuneMap() {
        return communes.getVillageCommuneMap();
    }

    public void putUrbanCommune(UrbanCommune urbanCommune) {
        communes.putUrbanCommune(urbanCommune);
    }

    public void putUrbVillCommune(UrbVillCommune urbVillCommune) {
        communes.putUrbVillCommune(urbVillCommune);
    }

    public void putVillageCommune(VillageCommune villageCommune) {
        communes.putVillageCommune(villageCommune);
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
            return new County(this);
        }
    }
}
