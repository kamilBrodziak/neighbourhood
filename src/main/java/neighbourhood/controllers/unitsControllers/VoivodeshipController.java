package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.County;
import neighbourhood.models.Voivodeship;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoivodeshipController {
    private Map<Integer, Voivodeship> voivodeships;

    public VoivodeshipController() {
        this.voivodeships = new HashMap<Integer, Voivodeship>();
    }

    public void createVoivodeship(List<String> voivodeshipSpecifications) {
        int voivodeshipID = Integer.parseInt(voivodeshipSpecifications.get(0));
        String voivodeshipName = voivodeshipSpecifications.get(1);
        voivodeships.put(voivodeshipID, new Voivodeship(voivodeshipName));
    }

    public void putCounty(int voivodeshipID, County county) {
        voivodeships.get(voivodeshipID).putCounty(county);
    }

    public Map<Integer, Voivodeship> getVoivodeships() {
        return voivodeships;
    }

    public Voivodeship getVoivodeship(int voivodeshipID) {
        return voivodeships.get(voivodeshipID);
    }
}
