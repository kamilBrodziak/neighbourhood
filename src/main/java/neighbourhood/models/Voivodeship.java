package neighbourhood.models;

import java.util.ArrayList;
import java.util.List;

public class Voivodeship {
    private String name;
    private List<County> countyList= new ArrayList<County>();

    public Voivodeship(String name) {
        this.name = name;
    }

    public void putCounty(County county) {
        countyList.add(county);
    }

    public String getName() {
        return name;
    }

    public List<County> getCountyList() {
        return countyList;
    }
}
