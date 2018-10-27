package neighbourhood.models;

public enum CommunitiesEnum {
    URBANCOMMUNE(1),
    VILLAGECOMMUNE(2),
    URBANVILLAGECOMMUNE(3),
    CITY(4),
    VILLAGE(5);

    int type;

    CommunitiesEnum(int type) { this.type = type; }

    public int getType() { return type; }

    public static CommunitiesEnum getCommunityTypeByInt(int comType) {
        for(CommunitiesEnum commEnum: CommunitiesEnum.values()) {
            if(commEnum.type == comType) {
                return commEnum;
            }
        }
        return null;
    }

}
