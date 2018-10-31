package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.County;
import neighbourhood.models.containers.Counties;

import java.util.HashMap;
import java.util.Map;

public class CountyController {
    private Counties counties;

    public CountyController() {
        this.counties = new Counties();
    }

    public Counties getCounties() {
        return counties;
    }

    public Map<String, County> getCountyMap() {
        return counties.getCommunityMap();
    }


    public County getCounty(String name) {
        return counties.getCommunityByName(name);
    }

    public int getCountyCount() { return getCountyMap().size();}

    public void putCounty(County county) {
        counties.putCommunity(county, county.getName());
    }

    public Map<String, Integer> getCountiesWithCommunesNumber() {
        Map<String, Integer> countiesCommunitiesNumber= new HashMap<>();
        for(County county: counties.getCommunityMap().values()) {
            countiesCommunitiesNumber.put( county.getName(), county.getUrbanCommuneMap().size() +
                            county.getUrbVillCommuneMap().size() + county.getVillageCommuneMap().size());
        }

        return countiesCommunitiesNumber;
    }
}
