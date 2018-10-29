package neighbourhood.models;

public class Delegacy extends Community {
    private String voivodeshipName;
    private String communeName;
    private String county;

    public Delegacy(Builder builder) {
        super(builder._name);
        voivodeshipName = builder._voivodeshipName;
        county = builder._countyName;
        communeName = builder._communeName;
    }

    public String getCommuneName() {
        return communeName;
    }

    public String getCounty() { return county; }

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

        @Override
        public Builder withName(String name) {
            this._name = name;
            return this;
        }

        @Override
        public Community createCommunity() {
            return new Delegacy(this);
        }
    }
}
