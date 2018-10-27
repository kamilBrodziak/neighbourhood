package neighbourhood.controllers.unitsControllers;

import neighbourhood.models.County;

import java.util.List;

public class CountyController {
    private VoivodeshipController voiController;

    public CountyController(VoivodeshipController voiController) {
        this.voiController = voiController;
    }

    public void createCounty(List<String> communitySpecifications) {
        County county = new County();
    }
}
