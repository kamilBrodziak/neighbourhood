package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.containers.Voivodeships;
import neighbourhood.models.Voivodeship;

import java.util.Map;

public class VoivodeshipController {
    private Voivodeships voivodeships;
    public VoivodeshipController() {
        this.voivodeships = new Voivodeships();
    }

    public Voivodeships getCounties() {
        return voivodeships;
    }

    public Map<String, Voivodeship> getCountyMap() {
        return voivodeships.getVoivodeshipMap();
    }

    public Voivodeship getVoivodeshipByName(String name) {
        return voivodeships.getVoivodeshipByName(name);
    }

    public void putVoivodeship(Voivodeship voivodeship) {
        voivodeships.putVoivodeship(voivodeship);
    }
}
