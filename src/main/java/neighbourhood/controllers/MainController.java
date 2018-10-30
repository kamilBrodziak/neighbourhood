package neighbourhood.controllers;

import neighbourhood.dao.MalopolskaDAO;
import neighbourhood.view.Menu;
import neighbourhood.view.Search;
import neighbourhood.view.Statistics;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private UnitController unitController;

    public MainController() {
        unitController = new UnitController();
        ClassLoader classLoader = getClass().getClassLoader();
        MalopolskaDAO malopolskaDAO = new MalopolskaDAO(new File(classLoader.getResource("malopolska2.csv").getFile()), unitController);
        try {
            malopolskaDAO.extractInformation("\n", ";");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String input = "";
        Scanner getUserChoice = new Scanner(System.in);
        while(!input.equals("6")) {
            input = "";
            Menu.showMenu();
            if(getUserChoice.hasNextLine()) {
                input = getUserChoice.nextLine();
            }

            switch(input) {
                case "1":
                    showStatistics();
                    break;
                case "5":
                    searchFor();
                    break;
                case "6":
                    return;
            }
        }
    }

    private void showStatistics() {
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

        Statistics.showStatistics(rows, headersList);
    }

    private void searchFor() {
        Search.searchFor(unitController);
    }
}
