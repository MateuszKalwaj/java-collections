package pl.mk.collections;

import java.util.ArrayList;
import java.util.List;

public class Cave {

    private List<Dragon> dragonList = new ArrayList<>();

    public List<Dragon> getDragonList() {
        return  dragonList;
    }

    public void setDragonList(List<Dragon> dragonList) {
        this.dragonList = dragonList;
    }

    public void addDragon (Dragon dragon) {
        dragonList.add(dragon);
    }

    public void deleteDragon (Dragon dragon) {
        dragonList.remove(dragon);
    }
}
