package neighbourhood.models;

import neighbourhood.models.containers.*;

import java.util.Map;

public class County extends Community{
    private UrbanCommunes urbanCommunes;
    private UrbVillCommunes urbVillCommunes;
    private VillageCommunes villageCommunes;

    private String voivodeshipName;

    public County(Builder builder) {
        super(builder._name, CommunityEnum.COUNTY);
        this.voivodeshipName = builder._voivodeshipName;
        urbanCommunes = new UrbanCommunes();
        urbVillCommunes = new UrbVillCommunes();
        villageCommunes = new VillageCommunes();
    }

    public UrbanCommunes getUrbanCommunes() {
        return urbanCommunes;
    }

    public UrbVillCommunes getUrbVillCommunes() {
        return urbVillCommunes;
    }

    public VillageCommunes getVillageCommunes() {
        return villageCommunes;
    }

    public Map<String, UrbanCommune> getUrbanCommuneMap() {
        return urbanCommunes.getCommunityMap();
    }

    public Map<String, UrbVillCommune> getUrbVillCommuneMap() {
        return urbVillCommunes.getCommunityMap();
    }

    public Map<String, VillageCommune> getVillageCommuneMap() {
        return villageCommunes.getCommunityMap();
    }

    public void putUrbanCommune(UrbanCommune urbanCommune) {
        urbanCommunes.putCommunity(urbanCommune, urbanCommune.getName());
    }

    public void putUrbVillCommune(UrbVillCommune urbVillCommune) {
        urbVillCommunes.putCommunity(urbVillCommune, urbVillCommune.getName());
    }

    public void putVillageCommune(VillageCommune villageCommune) {
        villageCommunes.putCommunity(villageCommune, villageCommune.getName());
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
