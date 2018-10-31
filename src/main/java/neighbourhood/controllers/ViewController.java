package neighbourhood.controllers;

import neighbourhood.tools.CommunityNamesTools;
import neighbourhood.view.Search;
import neighbourhood.view.TablePrint;

import java.util.*;

public class ViewController {

    public void showStatistics(UnitController unitController) {
        ArrayList<String> headersList = new ArrayList<String>() {{
            add("MAŁOPOLSKA");
        }};

        List<ArrayList<String>> rows= new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{
                add(unitController.getVoiController().getVoivodeshipCount() + "");
                add("województwo");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getCouController().getCountyCount() +
                        unitController.getCouCityController().getCountyCityCount() + "");
                add("powiat");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getCommController().getUrbanCommuneCount() + "");
                add("gmina miejska");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getCommController().getVillageCommuneCount() + "");
                add("gmina wiejska");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getCommController().getUrbVillCommuneCount() + "");
                add("gmina miejsko-wiejska");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getVillController().getVillageCount() + "");
                add("obszar wiejski");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getCityController().getCityCount() + "");
                add("miasto");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getCouCityController().getCountyCityCount() + "");
                add("miasto na prawach powiatu");
            }});
            add(new ArrayList<String>() {{
                add(unitController.getDeleController().getDelegacyCount() + "");
                add("delegatura");
            }});
        }};

        TablePrint.showTable(rows, headersList);
    }

    public void searchFor(UnitController unitController) {
        Search.searchFor(unitController);
    }

    public void displayNames(UnitController unitController) {
        int largestSize = 0;
        ArrayList<String> largestNames = new ArrayList<>();
        Map<String, Integer> countyCommunities = unitController.getCouController().getCountiesWithCommunesNumber();
        countyCommunities.putAll(unitController.getCouCityController().getCountiesWithCommunesNumber());
        for(String key: countyCommunities.keySet()) {
            int currCountyCommuneSize = countyCommunities.get(key);
            if(currCountyCommuneSize > largestSize) {
                largestSize = currCountyCommuneSize;
                largestNames = new ArrayList<>();
                largestNames.add(key);
            } else if(currCountyCommuneSize == largestSize) {
                largestNames.add(key);
            }
        }

        ArrayList<ArrayList<String>> output = new ArrayList<>();
        output.add(largestNames);

        ArrayList<String> headers = new ArrayList<>();
        headers.add("County's names with the largest number of communes.");

        TablePrint.showTable(output, headers);
    }


    public void displayLongestCityNames(UnitController unitController) {
        Set<String> names = unitController.getCityController().getCityMap().keySet();
        ArrayList<String> largestNames = CommunityNamesTools.searchForLongestString(names);
        ArrayList<ArrayList<String>> rows = new ArrayList<>();
        ArrayList<String> headers = new ArrayList<String>() {{
            add("LONGEST CITY NAMES");
        }};
        for(String name: largestNames) {
            rows.add(new ArrayList<String>(){{
                add(name.replaceAll("[0-9]", ""));
            }});
        }
        TablePrint.showTable(rows, headers);
    }

    public void displayNLongestCityNames(UnitController unitController, int n) {
        ArrayList<String> nLongestCityNames = new ArrayList<String>() {{
            addAll(unitController.getCityController().getCityMap().keySet());
        }};

        nLongestCityNames.sort(Comparator.comparingInt(String::length));

        ArrayList<ArrayList<String>> rows = new ArrayList<>();
        ArrayList<String> headers = new ArrayList<String>() {{
            add("LONGEST CITY NAMES");
        }};

        for(int i = nLongestCityNames.size() - 1; i > nLongestCityNames.size() - n - 1; --i) {
            String name = nLongestCityNames.get(i);
            rows.add(new ArrayList<String>(){{
                add(name.replaceAll("[0-9]", ""));
            }});
        }
        TablePrint.showTable(rows, headers);
    }
}
