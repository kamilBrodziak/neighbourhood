package neighbourhood;

import neighbourhood.controllers.MainController;
import neighbourhood.dao.MalopolskaDAO;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        MainController mainController = new MainController();

        mainController.run();

    }
}
