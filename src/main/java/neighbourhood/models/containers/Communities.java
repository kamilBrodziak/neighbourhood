package neighbourhood.models.containers;

import java.util.HashMap;
import java.util.Map;

public abstract class Communities<T> {
    public Map<String, T> communityMap;
    static int id = 0;

    public Communities() {
        communityMap = new HashMap<>();
    }

    public Map<String, T> getCommunityMap() {
        return communityMap;
    }

    public void putCommunity(T community, String name) {
        id++;
        communityMap.put(name + id, community);
    }

    public T getCommunityByName(String name) {
        name = name.replaceAll("[^A-Za-z]", "");
        if(communityMap.containsKey(name)) {
            return communityMap.get(name);
        }
        return null;
    }
}
