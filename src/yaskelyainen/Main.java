package yaskelyainen;

public class Main {
    static void main() {
        Nut[] nuts = Tree.growNut(15);
        Squirrel squirrel = new Squirrel();
        squirrel.pickNuts(nuts);
    }
}
