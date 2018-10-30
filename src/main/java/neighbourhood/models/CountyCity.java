package neighbourhood.models;

import neighbourhood.models.containers.UrbVillCommunes;
import neighbourhood.models.containers.UrbanCommunes;
import neighbourhood.models.containers.VillageCommunes;

import java.util.Map;

public class CountyCity extends Community {
    private String voivodeshipName;
    private UrbanCommunes urbanCommunes;
    private UrbVillCommunes urbVillCommunes;
    private VillageCommunes villageCommunes;

    public CountyCity(Builder builder) {
        super(builder._name, CommunityEnum.COUNTYCITY);
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
