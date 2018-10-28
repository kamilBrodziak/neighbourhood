package neighbourhood.controllers;

import neighbourhood.controllers.unitsControllers.*;
import neighbourhood.models.CommunityEnum;

import java.util.List;

public class UnitController {
    VoivodeshipController voiController;
    CountyController couController;
    CommuneController communeController;
    VillageController villController;
    CityController cityController;


    public UnitController() {
        voiController = new VoivodeshipController();
        couController = new CountyController();
        communeController = new CommuneController();
        villController = new VillageController();
        cityController = new CityController();
    }

    public VoivodeshipController getVoiController() {
        return voiController;
    }

    public CountyController getCouController() {
        return couController;
    }

    public CommuneController getCommuneController() {
        return communeController;
    }

    public VillageController getVillController() {
        return villController;
    }

    public CityController getCityController() {
        return cityController;
    }

    public void createUnit(List<String> unitSpecification) {
        int lastColumn = unitSpecification.size() - 1;
        CommunityEnum administrationsTypeEnum = CommunityEnum.getAdministrationByName(unitSpecification.get(lastColumn));
        switch (administrationsTypeEnum) {
            unitSpecification = unitSpecification.subList(0, lastColumn);
            case VOIVODESHIP:
                voiController.createVoivodeship(unitSpecification);
            case COUNTY:
                couController.createCounty(unitSpecification);
                break;
            case URBANCOMMUNE:
                urbCommController.createUrbanCommune(unitSpecification);
                break;
            case URBVILLCOMMUNE:
                urbVillComController.createUrbVillCommune(unitSpecification);
                break;
            case VILLAGECOMMUNE:
                villCommController.createVillageCommune(unitSpecification);
                break;
            case CITY:
                unitSpecification.set(0, voiController.getVoivodeship(Integer.parseInt(unitSpecification.get(0)));
                unitSpecification.set(1, couController.getCounty(Integer.parseInt(unitSpecification.get(1))));
                switch ()
                cityController.createCity(unitSpecification);
                break;
            case VILLAGE:
                villController.createVillage(unitSpecification);
                break;
        }
    }

}
