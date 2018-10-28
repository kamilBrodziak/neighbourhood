package neighbourhood.models;

public class Village extends Community{
    private String communeName;
    private String countyName;
    private String voivodeshipName;


    public Village(Builder builder) {
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


    public void setCommuneName(String communeName) {
        this.communeName = communeName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setVoivodeshipName(String voivodeshipName) {
        this.voivodeshipName = voivodeshipName;
    }
}
