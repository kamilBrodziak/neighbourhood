package neighbourhood.models;

public enum CommunityEnum {
    VOIVODESHIP("WOJEWÓDZTWO"),
    COUNTY("POWIAT"),
    URBANCOMMUNE("GMINA MIEJSKA"),
    URBVILLCOMMUNE("GMINA MIEJSKO-WIEJSKA"),
    VILLAGECOMMUNE("GMINA WIEJSKA"),
    CITY("MIASTO"),
    VILLAGE("OBSZAR WIEJSKI"),
    COUNTYCITY("MIASTO NA PRAWACH POWIATU"),
    DELEGACY("DELEGATURA");

    private String type;

    CommunityEnum(String type) { this.type = type; }

    public String getType() { return type; }

    public static CommunityEnum getAdministrationByName(String admType) {
        for(CommunityEnum admEnum: CommunityEnum.values()) {
            if(admEnum.getType().equals(admType)) {
                return admEnum;
            }
        }
        return null;
    }
}
