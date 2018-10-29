package neighbourhood.models;

public class Village extends Community{
    private String communeName;
    private String countyName;
    private String voivodeshipName;


    public Village(Builder builder) {
        super(builder._name);
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


    public void setCommuneName(String communeName) {
        this.communeName = communeName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setVoivodeshipName(String voivodeshipName) {
        this.voivodeshipName = voivodeshipName;
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
            return new Village(this);
        }
    }
}
