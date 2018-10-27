package neighbourhood.models.containers;

import neighbourhood.models.Administration;

import java.util.HashMap;
import java.util.Map;

public class Voivodeships implements Administrations {
    public Map<Integer, Administration> administrationMap;

    public Voivodeships() {
        administrationMap = new HashMap<Integer, Administration>();
    }

    public Administration getAdministrationByID(int ID) {
        return administrationMap.get(ID);
    }

    public Map<Integer, Administration> getAdministrationMap() {
        return administrationMap;
    }

    public void putAdministration(Administration administration) {
        administrationMap.put(administration.getID(), administration);
    }
}
