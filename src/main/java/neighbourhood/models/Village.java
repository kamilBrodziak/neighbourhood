package neighbourhood.models;

public class Village extends Community{
    private String commune;
    private String county;
    private String voivodeship;


    public Village(Builder builder) {
        super(builder);
        this.commune = builder._commune;
        this.county = builder._county;
        this.voivodeship = builder._voivodeship;
    }

    public String getCommune() {
        return commune;
    }

    public String getCounty() {
        return county;
    }

    public String getVoivodeship() {
        return voivodeship;
    }


    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }
}
