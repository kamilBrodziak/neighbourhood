package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.CountyCity;
import neighbourhood.models.containers.CountyCities;

import java.util.HashMap;
import java.util.Map;

public class CountyCityController {
    private CountyCities countyCities;

    public CountyCityController() {
        this.countyCities = new CountyCities();
    }

    public CountyCities getCountyCities() {
        return countyCities;
    }

    public Map<String, CountyCity> getCountyCityMap() {
        return countyCities.getCommunityMap();
    }

    public CountyCity getCountyCity(String name) {
        return countyCities.getCommunityByName(name);
    }

    public int getCountyCityCount() { return getCountyCityMap().size();}

    public Map<String, Integer> getCountiesWithCommunesNumber() {
        Map<String, Integer> countiesCommunitiesNumber= new HashMap<>();
        for(CountyCity county: countyCities.getCommunityMap().values()) {
            countiesCommunitiesNumber.put( county.getName(), county.getUrbanCommuneMap().size() +
                    county.getUrbVillCommuneMap().size() + county.getVillageCommuneMap().size());
        }

        return countiesCommunitiesNumber;
    }

    public void putCountyCity(CountyCity county) {
        countyCities.putCommunity(county, county.getName());
    }

}
