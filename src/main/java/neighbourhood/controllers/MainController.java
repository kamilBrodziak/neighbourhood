package neighbourhood.controllers;

import neighbourhood.dao.MalopolskaDAO;

public class MainController {
    private UnitController unitController;

    public MainController() {
        unitController = new UnitController();
        MalopolskaDAO malopolskaDAO = new MalopolskaDAO("src/main/resources/malopolska.csv", unitController);
    }

    public void run() {

    }
}
