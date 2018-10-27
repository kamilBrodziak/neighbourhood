package neighbourhood.models.containers;

import neighbourhood.models.Village;
import neighbourhood.models.Settlement;
import java.util.HashMap;
import java.util.Map;

public class Villages implements Settlements {
    public Map<Integer, Settlement> villageMap;

    public Villages() {
        villageMap = new HashMap<Integer, Settlement>();
    }

    public Settlement getSettlementByID(int ID) {
        return villageMap.get(ID);
    }

    public Map<Integer, Settlement> getSettlementMap() {
        return villageMap;
    }

    public void putSettlement(Settlement settlement) {
        villageMap.put(settlement.getID(), settlement);
    }

}