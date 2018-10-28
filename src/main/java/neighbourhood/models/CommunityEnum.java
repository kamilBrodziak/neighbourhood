package neighbourhood.models;

public enum CommunityEnum {
    VOIVODESHIP("województwo"),
    COUNTY("powiat"),
    URBANCOMMUNE("gmina miejska"),
    URBVILLCOMMUNE("gmina miejsko-wiejska"),
    VILLAGECOMMUNE("gmina wiejska"),
    CITY("miasto"),
    VILLAGE("obszar wiejski");

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
