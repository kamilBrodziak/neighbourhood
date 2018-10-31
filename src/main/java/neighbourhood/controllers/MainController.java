package neighbourhood.controllers;

import neighbourhood.dao.MalopolskaDAO;
import neighbourhood.view.Menu;

import java.io.File;
import java.util.Scanner;

public class MainController {
    private UnitController unitController;
    private ViewController viewController;

    public MainController() {
        unitController = new UnitController();
        viewController = new ViewController();
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
                    viewController.showStatistics(unitController);
                    break;
                case "2":
                    viewController.displayNLongestCityNames(unitController, 3);
                    break;
                case "3":
                    viewController.displayNames(unitController);
                    break;
                case "5":
                    viewController.searchFor(unitController);
                    break;
                case "6":
                    return;
            }
        }
    }

}
