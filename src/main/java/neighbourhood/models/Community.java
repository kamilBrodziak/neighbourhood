package neighbourhood.models;

public class Community {
    private String name;

    public Community() {}

    public Community(Builder builder) {
        this.name = builder._name;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        protected String _voivodeship;
        protected String _county;
        protected String _commune;
        protected String _name;

        public Builder withVoivodeship(String voivodeship) {
            this._voivodeship = voivodeship;
            return this;
        }

        public Builder withCounty(String county) {
            this._county = county;
            return this;
        }

        public Builder withCommune(String commune) {
            this._commune = commune;
            return this;
        }

        public Builder withName(String name) {
            this._name = _name;
            return this;
        }

        public Community createCommunity() {
            return new Community(this);
        }
    }
}
