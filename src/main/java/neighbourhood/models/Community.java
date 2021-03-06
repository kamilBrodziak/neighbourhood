package neighbourhood.models;

public abstract class Community {
    private String name;
    private final CommunityEnum communityType;

    public Community(String name, CommunityEnum communityType) {
        this.name = name;
        this.communityType = communityType;
    }

    public String getName() {
        return name;
    }

    public CommunityEnum getCommunityType() {
        return communityType;
    }

    public String getPolyClassName() {
        if (this instanceof Voivodeship) {
            return Voivodeship.class.getSimpleName();
        } else if(this instanceof County) {
            return County.class.getSimpleName();
        } else if(this instanceof  UrbanCommune) {
            return UrbanCommune.class.getSimpleName();
        } else if(this instanceof VillageCommune) {
            return VillageCommune.class.getSimpleName();
        } else if(this instanceof UrbVillCommune) {
            return UrbVillCommune.class.getSimpleName();
        } else if(this instanceof CountyCity) {
            return CountyCity.class.getSimpleName();
        } else if(this instanceof Delegacy) {
            return Delegacy.class.getSimpleName();
        } else if(this instanceof City) {
            return City.class.getSimpleName();
        } else if(this instanceof Village) {
            return Village.class.getSimpleName();
        }
        return "sss";
    }

    public interface IBuilder {
        public IBuilder withName(String name);
        public Community createCommunity();
    }
}
