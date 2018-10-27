package neighbourhood.models.containers;

import neighbourhood.models.Commune;

import java.util.Map;

public interface Communes {
    Commune getCommuneByID(int id);
    void putCommune(Commune commune);
    Map<Integer, Commune> getCommuneMap();
}
