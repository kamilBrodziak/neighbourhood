package neighbourhood.models;

public class City extends Community{
    private String communeName;
    private String countyName;
    private String voivodeshipName;

    public City(Builder builder) {
        super(builder._name, CommunityEnum.CITY);
        this.communeName = builder._communeName;
        this.countyName = builder._countyName;
        this.voivodeshipName = builder._voivodeshipName;
    }

    public String getCommuneName() {
        return communeName;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getVoivodeshipName() {
        return voivodeshipName;
    }

    public static class Builder implements IBuilder {
        private String _voivodeshipName;
        private String _countyName;
        private String _communeName;
        private String _name;

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

        @Override
        public Builder withName(String name) {
            this._name = name;
            return this;
        }

        @Override
        public Community createCommunity() {
            return new City(this);
        }
    }

}