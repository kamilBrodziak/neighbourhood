package neighbourhood.models.containers;

import neighbourhood.models.City;
import neighbourhood.models.Settlement;
import java.util.HashMap;
import java.util.Map;

public class Cities implements Settlements {
    public Map<Integer, Settlement> cityMap;

    public Cities() {
        cityMap = new HashMap<Integer, Settlement>();
    }

    public Settlement getSettlementByID(int ID) {
        return cityMap.get(ID);
    }

    public Map<Integer, Settlement> getSettlementMap() {
        return cityMap;
    }

    public void putSettlement(Settlement settlement) {
        cityMap.put(settlement.getID(), settlement);
    }

}
