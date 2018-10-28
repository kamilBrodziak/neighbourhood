package neighbourhood.models;

import neighbourhood.controllers.UnitController;

public class CommunityFactory {
    private Community currVoivodeship;
    private Community currCounty;
    private Community currCommune;


    public Community createCommunity(CommunityEnum communityEnum, String name) {
        switch(communityEnum) {
            case VOIVODESHIP:
                Community voivodeship = new Voivodeship.Builder().withName(name).createCommunity();
                currVoivodeship = voivodeship;
                return voivodeship;
            case COUNTY:
                Community county = new County.Builder().withName(name).withVoivodeship(currVoivodeship.getName()).createCommunity();
                currCounty = county;
                ((Voivodeship)currVoivodeship).putCounty((County)county);
                return county;
            case URBANCOMMUNE:
                Community urbanCommune = new UrbanCommune.Builder().withName(name).withCounty(currCounty.getName()).withVoivodeship(currVoivodeship.getName()).createCommunity();
                currCommune = urbanCommune;
                ((County)currCounty).putUrbanCommune((UrbanCommune)urbanCommune);
                return urbanCommune;
            case URBVILLCOMMUNE:
                Community urbVillCommune = new UrbVillCommune.Builder().withName(name).withCounty(currCounty.getName()).withVoivodeship(currVoivodeship.getName()).createCommunity();
                currCommune = urbVillCommune;
                ((County)currCounty).putUrbVillCommune((UrbVillCommune)urbVillCommune);
                return urbVillCommune;
            case VILLAGECOMMUNE:
                Community villageCommune = new VillageCommune.Builder().withName(name).withCounty(currCounty.getName()).withVoivodeship(currVoivodeship.getName()).createCommunity();
                currCommune = villageCommune;
                ((County)currCounty).putVillageCommune((VillageCommune)villageCommune);
                return villageCommune;
            case CITY:
                Community city = new City.Builder().withName(name).withCommune(currCommune.getName()).withCounty(currCounty.getName()).withVoivodeship(currVoivodeship.getName()).createCommunity();
                if(currCommune instanceof UrbanCommune) {
                    ((UrbanCommune)currCommune).putCity((City)city);
                } else if(currCommune instanceof UrbVillCommune) {
                    ((UrbanCommune)currCommune).putCity((City)city);
                }
                return city;
            case VILLAGE:
                Community village = new Village.Builder().withName(name).withCommune(currCommune.getName()).withCounty(currCounty.getName()).withVoivodeship(currVoivodeship.getName()).createCommunity();
                if(currCommune instanceof UrbVillCommune) {
                    ((UrbVillCommune)currCommune).putVillage((Village) village);
                } else if(currCommune instanceof VillageCommune) {
                    ((VillageCommune)currCommune).putVillage((Village) village);

                }
                return village;
            default:
                return null;
        }
    }

}
