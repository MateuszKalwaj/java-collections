package pl.mk.collections.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Dragon> dragonfetchColor(Dragon.Color color) {
        List<Dragon.Color> colorList = Arrays.asList(color);
        return dragonList.stream().filter(dragon -> colorList.contains(dragon.getColor())).collect(Collectors.toList());
    }

    public List<String> dragonfetchName() {
        return dragonList.stream().map(Dragon::getName).collect(Collectors.toList());
    }

    public List<Dragon.Color> dragonColorUpperList() {
        return dragonList.stream().map((Dragon::getColor)).collect(Collectors.toList());
    }

    public List<Dragon> fetchNaturalSorted() {
        return dragonList.stream().sorted().collect(Collectors.toList());
    }

    public List<Dragon> fetchByAge() {
        return dragonList.stream()
                .sorted(Comparator.comparingInt(Dragon::getAge))
                .collect(Collectors.toList());
    }

    public boolean AgeValidation(int age) {
        boolean validation = dragonList.stream()
                .map(Dragon::getAge)
                .anyMatch(value -> value == age);
        return validation;
    }

    public boolean ColorValidation(Dragon.Color color) {
        boolean validation = dragonList.stream()
                .map(Dragon::getColor)
                .anyMatch(value -> value == color);
        return validation;
    }

    public List<DragonEgg> dragonEggList() {
        return dragonList.stream()
                .map(DragonEgg::new)
                .collect(Collectors.toList());
    }

    public List<DragonEgg> wingspanEgglist(int wingspan) {
        List<Dragon> wingspanDragonList;
        wingspanDragonList = dragonList.stream()
                .filter(dragon -> dragon.getWingsPan() > wingspan)
                .collect(Collectors.toList());
        return wingspanDragonList.stream()
                .map(DragonEgg::new)
                .collect(Collectors.toList());
    }


}