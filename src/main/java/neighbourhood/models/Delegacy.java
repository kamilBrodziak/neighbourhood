package neighbourhood.models;

public class Delegacy extends Community {
    private String voivodeshipName;
    private String communeName;
    private String county;

    public Delegacy(Builder builder) {
        super(builder);
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
}
