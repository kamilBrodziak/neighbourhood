package neighbourhood.models.containers;

import neighbourhood.models.Settlement;

import java.util.Map;

public interface Settlements {
    Settlement getSettlementByID(int id);
    void putSettlement(Settlement settlement);
    Map<Integer, Settlement> getSettlementMap();
}
