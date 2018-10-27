package neighbourhood.dao;

import neighbourhood.controllers.UnitController;
import neighbourhood.parsers.CSVParser;

public abstract class VoivodeshipDao {
    private String information;
    private UnitController unitController;

    public VoivodeshipDao(String path, UnitController unitController) {
        CSVParser parser = new CSVParser();
        this.information = parser.parse(path);
        this.unitController = unitController;

    }

    public UnitController getUnitController() {
        return unitController;
    }

    public String getInformation() {
        return information;
    }

    public void extractInformation(String splitDocChar, String splitLineChar) throws Exception {}

    private boolean hasChars(String str) {
        return str.length() != 0;
    }



}
