package pl.mk.collections.Models;

import java.util.Objects;

public class Dragon implements Comparable<Dragon> {

    public enum Color {
        WHITE, BLACK, GOLD, SILVER, RED
    }

    private int age;
    private int wingsPan;
    private String name;
    private Color color;

    public Dragon(Color color, int age, int wingsPan, String name) {
        this.age = age;
        this.wingsPan = wingsPan;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public int getWingsPan() {
        return wingsPan;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWingsPan(int wingsPan) {
        this.wingsPan = wingsPan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Dragon dragon = (Dragon) o;

        if (age != dragon.age)
            return false;
        if (wingsPan != dragon.wingsPan)
            return false;
        if (!name.equals(dragon.name))
            return false;
        return color == dragon.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age, wingsPan, name);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "color=" + color +
                ", age=" + age +
                ", wingspan='" + wingsPan + '\'' +
                ", name=" + name +
                '}';
    }

    @Override
    public int compareTo(Dragon dragon) {
        int check = color.compareTo(dragon.color);
        if (check == 0) {
            check = age - dragon.age;
        }
        if (check == 0) {
            check = wingsPan - dragon.wingsPan;
        }
        if (check == 0) {
            check = name.compareTo(dragon.name);
        }
        return check;
    }
}
