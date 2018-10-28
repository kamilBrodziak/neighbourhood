package neighbourhood.models;

public class CountyCity extends County {
    private String voivodeshipName;

    public CountyCity(Builder builder) {
        super(builder);
        this.voivodeshipName = builder._voivodeshipName;
    }

    public String getVoivodeshipName() {
        return voivodeshipName;
    }

}
