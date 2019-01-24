package pl.mk.collections;


public class Main {

    public static void main(String[] args) {
        System.out.println("Dragon cave is now open \n");

        //necessary to have all dragons in a new cave
        Cave cave = addDragons();

            cave.printAll();
        System.out.println();
            cave.printNames();
        System.out.println();
            cave.printNamesAndColors();
        System.out.println();
            cave.dragonOldest();
        System.out.println();
        System.out.println(cave.dragonLargestWings());
        System.out.println(cave.dragonCharsInLongestName());
        System.out.println(cave.dragonfetchColor(Dragon.Color.WHITE));
        System.out.println(cave.dragonfetchName());
        System.out.println(cave.dragonColorUpperList());
    }


    public static Cave addDragons() {
        Cave cave = new Cave();

        Dragon dragon1 = new Dragon( Dragon.Color.BLACK, 140, 27, "Doryu");
        cave.addDragon(dragon1);

        Dragon dragon2 = new Dragon(Dragon.Color.WHITE, 45, 18, "Draken");
        cave.addDragon(dragon2);

        Dragon dragon3 = new Dragon(Dragon.Color.SILVER, 231, 30, "Kaida");
        cave.addDragon(dragon3);

        Dragon dragon4 = new Dragon(Dragon.Color.RED, 90, 19, "Jiao-long");
        cave.addDragon(dragon4);

        Dragon dragon5 = new Dragon(Dragon.Color.GOLD, 94, 21, "Khuzayma");
        cave.addDragon(dragon5);

        Dragon dragon6 = new Dragon(Dragon.Color.BLACK, 88, 24, "Yong-sun");
        cave.addDragon(dragon6);

        Dragon dragon7 = new Dragon(Dragon.Color.SILVER, 180, 28, "Ryu");
        cave.addDragon(dragon7);

        Dragon dragon8 = new Dragon( Dragon.Color.WHITE, 20, 10, "Ejder");
        cave.addDragon(dragon8);

        Dragon dragon9 = new Dragon( Dragon.Color.RED, 47, 14, "Pandragon");
        cave.addDragon(dragon9);

        Dragon dragon10 = new Dragon( Dragon.Color.GOLD, 125, 26, "Tatsuo");
        cave.addDragon(dragon10);

        return cave;
    }
}
