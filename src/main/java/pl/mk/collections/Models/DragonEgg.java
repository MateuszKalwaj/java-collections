package pl.mk.collections.Models;

import java.util.Objects;

public class DragonEgg {
    private Dragon.Color color;

    public Dragon.Color getColor() {
        return color;
    }

    public void setColor(Dragon.Color color) {
        this.color = color;
    }

    //Constructor creating an egg based on a dragon passed as a parameter
    public DragonEgg(Dragon dragon) {
        this.color = dragon.getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DragonEgg dragonEgg = (DragonEgg) o;
        //return color == dragonEgg.color;
        return getColor() == dragonEgg.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "DragonEgg{" +
                "color=" + color +
                '}';
    }
}
