package neighbourhood.controllers;

import neighbourhood.dao.MalopolskaDAO;
import neighbourhood.view.Menu;
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
            }
        }
    }

    private void showStatistics() {
        ArrayList<String> headersList = new ArrayList<>();
        headersList.add("MAŁOPOLSKA");

        List<ArrayList<String>> rows= new ArrayList<ArrayList<String>>();
        ArrayList<String> row = new ArrayList<String>();

        row.add(unitController.getVoiController().getVoivodeshipCount() + "");
        row.add("województwo");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getCouController().getCountyCount() +
                unitController.getCouCityController().getCountyCityCount() + "");
        row.add("powiat");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getCommController().getUrbanCommuneCount() + "");
        row.add("gmina miejska");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getCommController().getVillageCommuneCount() + "");
        row.add("gmina wiejska");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getCommController().getUrbVillCommuneCount() + "");
        row.add("gmina miejsko-wiejska");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getVillController().getVillageCount() + "");
        row.add("obszar wiejski");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getCityController().getCityCount() + "");
        row.add("miasto");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getCouCityController().getCountyCityCount() + "");
        row.add("miasto na prawach powiatu");
        rows.add(row);

        row = new ArrayList<>();
        row.add(unitController.getDeleController().getDelegacyCount() + "");
        row.add("delegatura");
        rows.add(row);

        Statistics.showStatistics(rows, headersList);
    }
}
