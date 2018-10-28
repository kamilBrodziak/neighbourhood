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


    public UnitController() {
        voiController = new VoivodeshipController();
        couController = new CountyController();
        commController = new CommuneController();
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
        return commController;
    }

    public VillageController getVillController() {
        return villController;
    }

    public CityController getCityController() {
        return cityController;
    }

    public void putUnit(Community community) {
        CommunityEnum communityType = CommunityEnum.valueOf(community.getClass().getSimpleName());
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
        }
    }

}
