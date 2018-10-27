package neighbourhood.models;

public enum AdministrationsEnum {
    VOIVODESHIP(3),
    COUNTY(4),
    COMMUNITY(6);

    int type;

    AdministrationsEnum(int type) { this.type = type; }

    public int getType() { return type; }

    public static AdministrationsEnum getCommunityTypeByInt(int comType) {
        for(AdministrationsEnum admEnum: AdministrationsEnum.values()) {
            if(admEnum.type == comType) {
                return admEnum;
            }
        }
        return null;
    }
}
