package neighbourhood.models.containers;

import neighbourhood.models.Voivodeship;

import java.util.HashMap;
import java.util.Map;

public class Voivodeships {
    public Map<String, Voivodeship> voivodeshipMap;

    public Voivodeships() {
        voivodeshipMap = new HashMap<String, Voivodeship>();
    }

    public Voivodeship getVoivodeshipByName(String name) {
        if(voivodeshipMap.containsKey(name)) {
            return voivodeshipMap.get(name);
        }
        return null;
    }

    public Map<String, Voivodeship> getVoivodeshipMap() {
        return voivodeshipMap;
    }

    public void putVoivodeship(Voivodeship voivodeship) {
        voivodeshipMap.put(voivodeship.getName(), voivodeship);
    }
}
