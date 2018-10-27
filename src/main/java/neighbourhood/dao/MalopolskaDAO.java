package neighbourhood.dao;

import neighbourhood.controllers.UnitController;
import neighbourhood.models.CommunitiesEnum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MalopolskaDAO extends VoivodeshipDao {

    public MalopolskaDAO(String path, UnitController unitController) {

        super(path, unitController);
    }

    @Override
    public void extractInformation(String splitDocChar, String splitLineChar) throws Exception{
        String commInfor = super.getInformation();
        InformationIterator docIterator = new InformationIterator(commInfor, splitDocChar);
        InformationIterator lineIterator;

        while(docIterator.hasNext()) {
            lineIterator = new InformationIterator(docIterator.next(), splitDocChar);

            String specification;
            List<String> communitySpecifications = new ArrayList<String>();
            while (lineIterator.hasNext()) {
                specification = lineIterator.next();
                if (!specification.equals("")) {
                    communitySpecifications.add(specification);
                }
            }

            super.getUnitController().createUnit(communitySpecifications);
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
