package neighbourhood.dao;

import neighbourhood.controllers.UnitController;
import neighbourhood.models.Community;
import neighbourhood.models.CommunityEnum;
import neighbourhood.models.CommunityFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MalopolskaDAO extends VoivodeshipDao {

    public MalopolskaDAO(String path, UnitController unitController) {

        super(path, unitController);
    }

    @Override
    public void extractInformation(String splitDocChar, String splitLineChar) throws Exception{
        String commInfor = super.getInformation().toUpperCase();
        InformationIterator docIterator = new InformationIterator(commInfor, splitDocChar);
        String[] communitySpecifications;
        String communityName;
        Community community;
        CommunityEnum communityType;
        CommunityFactory communityFactory = new CommunityFactory();


        while(docIterator.hasNext()) {
            communitySpecifications = docIterator.next().split(splitLineChar);
            communityName = communitySpecifications[3];
            communityType = CommunityEnum.getAdministrationByName(communitySpecifications[4]);

            community = communityFactory.createCommunity(communityType, communityName);
            super.getUnitController().createUnit(community);
        }
    }


    private class InformationIterator implements Iterator {
        private int i = 0;
        private String[] str;

        public InformationIterator(String str, String splitChar) {
            this.str = str.split(splitChar);
        }

        public boolean hasNext() { return i > str.length; }

        public String next() { return str[i++]; }

        public void remove() {}

    }
}
