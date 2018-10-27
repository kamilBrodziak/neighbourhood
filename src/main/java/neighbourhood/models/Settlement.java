package neighbourhood.models;

public class Settlement {
    private final String whichVoivodeship;
    private final String whichCounty;
    private final String whichCommune;
    private final String name;

    public Settlement(Builder builder) {
        this.whichVoivodeship = builder._voivodeship;
        this.whichCounty = builder._county;
        this.whichCommune = builder._commune;
        this.name = builder._name;
    }

    public class Builder {
        private String _voivodeship;
        private String _county;
        private String _commune;
        private String _name;

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
            this._name = name;
            return this;
        }

        public Settlement Build() {
            return new Settlement(this);
        }
    }
}
