package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.containers.Voivodeships;
import neighbourhood.models.Voivodeship;

import java.util.Map;

public class VoivodeshipController {
    private Voivodeships voivodeships;
    public VoivodeshipController() {
        this.voivodeships = new Voivodeships();
    }

    public Voivodeships getVoivodeships() {
        return voivodeships;
    }

    public Map<String, Voivodeship> getVoivodeshipMap() {
        return voivodeships.getCommunityMap();
    }

    public Voivodeship getVoivodeshipByName(String name) {
        return voivodeships.getCommunityByName(name);
    }

    public int getVoivodeshipCount() { return getVoivodeshipMap().size();}

    public void putVoivodeship(Voivodeship voivodeship) {
        voivodeships.putCommunity(voivodeship, voivodeship.getName());
    }
}
