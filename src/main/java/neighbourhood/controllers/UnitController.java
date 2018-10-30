package neighbourhood.controllers;

import neighbourhood.controllers.unitsControllers.*;
import neighbourhood.models.CommunityEnum;
import neighbourhood.models.*;

public class UnitController {
    VoivodeshipController voiController;
    CountyController couController;
    CommuneController commController;
    VillageController villController;
    CityController cityController;
    CountyCityController couCityController;
    DelegacyController deleController;


    public UnitController() {
        voiController = new VoivodeshipController();
        couController = new CountyController();
        commController = new CommuneController();
        villController = new VillageController();
        cityController = new CityController();
        couCityController = new CountyCityController();
        deleController = new DelegacyController();
    }

    public VoivodeshipController getVoiController() {
        return voiController;
    }

    public CountyController getCouController() {
        return couController;
    }

    public CommuneController getCommController() {
        return commController;
    }

    public VillageController getVillController() {
        return villController;
    }

    public CityController getCityController() {
        return cityController;
    }

    public CountyCityController getCouCityController() {
        return couCityController;
    }

    public DelegacyController getDeleController() {
        return deleController;
    }


    public void putUnit(Community community) {
        CommunityEnum communityType = CommunityEnum.valueOf(community.getPolyClassName().toUpperCase());
        switch (communityType) {
            case VOIVODESHIP:
                voiController.putVoivodeship((Voivodeship)community);
                break;
            case COUNTY:
                couController.putCounty((County)community);
                break;
            case CITY:
                cityController.putCity((City)community);
                break;
            case VILLAGE:
                villController.putVillage((Village) community);
                break;
            case URBANCOMMUNE:
            case URBVILLCOMMUNE:
            case VILLAGECOMMUNE:
                commController.putCommune(community);
                break;
            case COUNTYCITY:
                couCityController.putCountyCity((CountyCity)community);
                break;
            case DELEGACY:
                deleController.putDelegacy((Delegacy)community);
                break;
        }
    }

}
