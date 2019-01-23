package pl.mk.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cave {

    private List<Dragon> dragonList = new ArrayList<>();

    public List<Dragon> getDragonList() {
        return dragonList;
    }

    public void setDragonList(List<Dragon> dragonList) {
        this.dragonList = dragonList;
    }

    public void addDragon(Dragon dragon) {
        dragonList.add(dragon);
    }

    public void deleteDragon(Dragon dragon) {
        dragonList.remove(dragon);
    }

    //task 8- print all, print names, print names with colors
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

    //task 9- print the oldest dragon, with the largest wingspan and print characters in dragon name

    public Dragon dragonOldest() {
        return dragonList.stream().max(Comparator.comparingInt(Dragon::getAge)).orElse(null);
    }

    public int dragonLargestWings() {
        return dragonList.stream().mapToInt(Dragon::getWingsPan).max().orElse(0);
    }

    public int dragonCharsInLongestName() {
        return dragonList.stream()
                .map(Dragon::getName)
                .mapToInt(String::length)
                .max().orElse(0);
    }
}