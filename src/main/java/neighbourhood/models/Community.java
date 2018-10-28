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
        protected String _voivodeshipName;
        protected String _countyName;
        protected String _communeName;
        protected String _name;
        protected String _delegacyName;

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

        public Builder withDelegacy(String delegacyName) {
            this._delegacyName = delegacyName;
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
