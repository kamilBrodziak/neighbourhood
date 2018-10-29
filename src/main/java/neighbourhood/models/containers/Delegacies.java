package neighbourhood.models.containers;

import java.util.HashMap;
import java.util.Map;
import neighbourhood.models.Delegacy;

public class Delegacies {
    public Map<String, Delegacy> delegacyMap;
    private static int id = 0;


    public Delegacies() {
        delegacyMap = new HashMap<>();
    }

    //MUST ADD ID TO NAME, NOT DONE
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
        id ++;
        delegacyMap.put(delegacy.getName() + id, delegacy);
    }

}
