package Deminov;

public class Main4 {
    public static void main(String[] args) {

        Tree tree = new Tree();

        Nut[] someNuts = tree.growingNuts(15);

        Squirrel squirrel = new Squirrel();

        squirrel.collectingNuts(someNuts);
    }
}
