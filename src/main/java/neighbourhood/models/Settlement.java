package neighbourhood.models;

public class Settlement {
    private final String whichVoivodeship;
    private final String whichCounty;
    private final String[] whichCommune;
    private final String name;
    private final int id;

    public Settlement(Builder builder) {
        this.whichVoivodeship = builder._voivodeship;
        this.whichCounty = builder._county;
        this.whichCommune = builder._commune;
        this.name = builder._name;
        this.id = builder._ID;
    }

    public int getId() {
        return id;
    }

    public String getVoivodeship() {
        return whichVoivodeship;
    }

    public String getCounty() {
        return whichCounty;
    }

    public String getName() {
        return name;
    }

    public String[] getCommunes() {
        return whichCommune;
    }

    public class Builder {
        private String _voivodeship;
        private String _county;
        private String[] _commune;
        private String _name;
        private int _ID;

        public Builder withVoivodeship(String voivodeship) {
            this._voivodeship = voivodeship;
            return this;
        }

        public Builder withCounty(String county) {
            this._county = county;
            return this;
        }

        public Builder withCommune(String[] commune) {
            this._commune = commune;
            return this;
        }

        public Builder withName(String name) {
            this._name = name;
            return this;
        }

        public Builder withID(int id) {
            this._ID = id;
            return this;
        }

        public Settlement Build() {
            return new Settlement(this);
        }
    }
}
