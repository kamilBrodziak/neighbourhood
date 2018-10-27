package neighbourhood.models.containers;

import neighbourhood.models.Administration;

import java.util.Map;

public interface Administrations {
    Administration getAdministrationByID(int id);
    void putAdministration(Administration settlement);
    Map<Integer, Administration> getAdministrationMap();
}
