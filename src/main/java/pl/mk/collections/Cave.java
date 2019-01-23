package pl.mk.collections;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void printAll() {
        dragonList.forEach(System.out::println);
    }
    public void printNames() {
        dragonList.stream().map(Dragon::getName).forEach(System.out::println);
    }
    public void printNamesAndColors() {
        dragonList.stream()
                .sorted(Comparator.comparing(Dragon::getName))
                .map(dragon -> dragon.getName() + ", " +
                        dragon.getColor().toString().toLowerCase())
                .forEach(System.out::println);
    }
}
