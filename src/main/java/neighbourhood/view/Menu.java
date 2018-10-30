package neighbourhood.view;

import neighbourhood.tools.Tools;

public class Menu {

    public static void showMenu() {
        Tools.clearScreen();
        System.out.println("What would you like to do:");
        System.out.println("\t(1) List statistics");
        System.out.println("\t(2) Display 3 cities with longest names");
        System.out.println("\t(3) Display county's name with the largest number of communities");
        System.out.println("\t(4) Display locations, that belong to more than one category");
        System.out.println("\t(5) Advanced search");
        System.out.println("\t(6) Exit program");
    }
}
