package neighbourhood.controllers;

import neighbourhood.controllers.unitsControllers.*;
import neighbourhood.models.AdministrationsEnum;
import neighbourhood.models.CommunitiesEnum;

import java.util.List;

public class UnitController {
    VoivodeshipController voiController;
    CountyController couController;
    UrbanCommuneController urbCommController;
    VillageCommuneController villCommController;
    UrbVillCommuneController urbVillComController;
    VillageController villController;
    CityController cityController;

    public UnitController() {
        voiController = new VoivodeshipController();
        couController = new CountyController(voiController);
        urbCommController = new UrbanCommuneController(couController);
        villCommController = new VillageCommuneController(couController);
        urbVillComController = new UrbVillCommuneController(couController);
        villController = new VillageController(urbVillComController, villController);
        cityController = new CityController(urbVillComController, urbCommController);


    }

    public void createUnit(List<String> unitSpecification) {
        int colAmount = unitSpecification.size();
        switch (AdministrationsEnum.getCommunityTypeByInt(colAmount)) {
            case VOIVODESHIP:
                voiController.createVoivodeship(unitSpecification);
            case COUNTY:
                couController.createCounty(unitSpecification);
                break;
            case COMMUNITY:
                createCommunity(unitSpecification);
                break;
        }
    }

    private void createCommunity(List<String> communitySpecifications) {
        /* iterated from zero */
        int commTypeCol = 3;
        int communityType = Integer.parseInt(communitySpecifications.get(commTypeCol));
        switch (CommunitiesEnum.getCommunityTypeByInt(communityType)) {
            case URBANCOMMUNE:
                urbCommController.createUrbanCommune(communitySpecifications);
                break;
            case VILLAGECOMMUNE:
                villCommController.createVillageCommune(communitySpecifications);
                break;
            case URBANVILLAGECOMMUNE:
                urbVillComController.createUrbVillCommune(communitySpecifications);
                break;
            case CITY:
                cityController.createCity(communitySpecifications);
                break;
            case VILLAGE:
                villController.createVillage(communitySpecifications);
                break;

        }
    }


}
