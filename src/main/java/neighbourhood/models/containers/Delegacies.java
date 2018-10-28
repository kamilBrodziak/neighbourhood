package neighbourhood.models.containers;

import java.util.HashMap;
import java.util.Map;
import neighbourhood.models.Delegacy;

public class Delegacies {
    public Map<String, Delegacy> delegacyMap;

    public Delegacies() {
        delegacyMap = new HashMap<String, Delegacy>();
    }

    public Delegacy getDelegacyByName(String name) {
        if(delegacyMap.containsKey(name)) {
            return delegacyMap.get(name);
        }
        return null;
    }

    public Map<String, Delegacy> getDelegacyMap() {
        return delegacyMap;
    }

    public void putDelegacy(Delegacy delegacy) {
        delegacyMap.put(delegacy.getName(), delegacy);
    }
}
