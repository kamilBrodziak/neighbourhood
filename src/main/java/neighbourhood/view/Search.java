package neighbourhood.view;

import neighbourhood.controllers.UnitController;
import neighbourhood.tools.CommunityNamesTools;
import neighbourhood.tools.Tools;

import java.util.*;

public class Search {

    public static void searchFor(UnitController unitController) {
        CommunityNamesTools communityNamesTools = new CommunityNamesTools(unitController);
        String name = "";

        Tools.clearScreen();
        Scanner getName = new Scanner(System.in);
        System.out.println("Provide community name you are looking for:");
        if(getName.hasNextLine()) {
            name = getName.nextLine();
        }

        ArrayList<ArrayList<String>> searched = communityNamesTools.searchForName(name);

        ArrayList<String> headers = new ArrayList<>();
        headers.add("LOCATION");
        headers.add("TYPE");

        TablePrint.showTable(searched, headers);
    }
}
