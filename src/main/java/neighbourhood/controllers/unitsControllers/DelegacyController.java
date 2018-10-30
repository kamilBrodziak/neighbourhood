package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.Delegacy;
import neighbourhood.models.containers.Delegacies;

import java.util.Map;

public class DelegacyController {
    private Delegacies delegacies;

    public DelegacyController() {
        this.delegacies = new Delegacies();
    }

    public Delegacies getDelegacies() {
        return delegacies;
    }

    public Map<String, Delegacy> getDelegacyMap() {
        return delegacies.getCommunityMap();
    }

    public Delegacy getDelegacy(String name) {
        return delegacies.getCommunityByName(name);
    }

    public int getDelegacyCount() { return getDelegacyMap().size();}

    public void putDelegacy(Delegacy delegacy) {
        delegacies.putCommunity(delegacy, delegacy.getName());
    }
}
