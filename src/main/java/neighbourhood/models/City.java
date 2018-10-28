package neighbourhood.models;

public class City extends Community{
    private String communeName;
    private String countyName;
    private String voivodeshipName;

    public City(Builder builder) {
        super(builder);
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

}