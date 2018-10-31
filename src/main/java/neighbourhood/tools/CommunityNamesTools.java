package neighbourhood.tools;

import neighbourhood.controllers.UnitController;
import neighbourhood.models.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommunityNamesTools {
    Map<String, CommunityEnum> communityNameMap;

    public CommunityNamesTools(UnitController unitController) {
        communityNameMap = new HashMap<>();
        createCommunityNameMap(unitController);
    }

    private void createCommunityNameMap(UnitController unitController) {
        Map<String, City> cityMap = unitController.getCityController().getCityMap();
        for(String name: cityMap.keySet()) {
            communityNameMap.put(name, cityMap.get(name).getCommunityType());
        }

        Map<String, Village> villageMap = unitController.getVillController().getVillageMap();
        for(String name: cityMap.keySet()) {
            communityNameMap.put(name, villageMap.get(name).getCommunityType());
        }

        Map<String, UrbanCommune> urbanCommuneMap = unitController.getCommController().getUrbanCommuneMap();
        for(String name: urbanCommuneMap.keySet()) {
            communityNameMap.put(name, urbanCommuneMap.get(name).getCommunityType());
        }

        Map<String, UrbVillCommune> urbVillCommuneMap = unitController.getCommController().getUrbVillCommuneMap();
        for(String name: urbVillCommuneMap.keySet()) {
            communityNameMap.put(name, urbVillCommuneMap.get(name).getCommunityType());
        }

        Map<String, VillageCommune> villageCommuneMap = unitController.getCommController().getVillageCommuneMap();
        for(String name: villageCommuneMap.keySet()) {
            communityNameMap.put(name, villageCommuneMap.get(name).getCommunityType());
        }

        Map<String, County> countyMap = unitController.getCouController().getCountyMap();
        for(String name: countyMap.keySet()) {
            communityNameMap.put(name, countyMap.get(name).getCommunityType());
        }

        Map<String, CountyCity> countyCityMap = unitController.getCouCityController().getCountyCityMap();
        for(String name: countyCityMap.keySet()) {
            communityNameMap.put(name, countyCityMap.get(name).getCommunityType());
        }

        Map<String, Delegacy> delegacyMap = unitController.getDeleController().getDelegacyMap();
        for(String name: delegacyMap.keySet()) {
            communityNameMap.put(name, delegacyMap.get(name).getCommunityType());
        }

        Map<String, Voivodeship> voivodeshipMap = unitController.getVoiController().getVoivodeshipMap();
        for(String name: voivodeshipMap.keySet()) {
            communityNameMap.put(name, voivodeshipMap.get(name).getCommunityType());
        }
    }

    public ArrayList<ArrayList<String>> searchForName(String name) {
        ArrayList<ArrayList<String>> searched= new ArrayList<>();

        for(String communityName: communityNameMap.keySet()) {
            if(communityName.toUpperCase().contains(name.toUpperCase())) {
                ArrayList<String> record = new ArrayList<>();
                record.add(communityName.replaceAll("[1-9]", ""));
                record.add(communityNameMap.get(communityName).getType());
                searched.add(record);
            }
        }

        return searched;
    }

    public static ArrayList<String> searchForLongestString(Set<String> strings) {
        int length = 0;
        ArrayList<String> stringArrayList = new ArrayList<>();
        for(String string: strings) {
            if(length < string.length()) {
                length = string.length();
                stringArrayList = new ArrayList<>();
                stringArrayList.add(string);
            } else if( length == string.length()) {
                stringArrayList.add(string);
            }
        }
        return stringArrayList;
    }
}
