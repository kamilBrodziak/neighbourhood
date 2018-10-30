package neighbourhood.models;

import neighbourhood.models.containers.Villages;

import java.util.Map;

public class VillageCommune extends Community {
    private Villages villages;
    private String countyName;
    private String voivodeshipName;


    public VillageCommune(Builder builder) {
        super(builder._name, CommunityEnum.VILLAGECOMMUNE);
        this.countyName = builder._countyName;
        this.voivodeshipName = builder._voivodeshipName;
        villages = new Villages();
    }


    public Villages getVillages() {
        return villages;
    }

    public Map<String, Village> getVillageMap() {
        return villages.getCommunityMap();
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
            return new VillageCommune(this);
        }
    }
}
