package yaskelyainen;

public class Tree {
    public static Nut[] growNut(int countNut){
        Nut[] nuts = new Nut[countNut];
        for (int i = 0; i < countNut; i++) {
            nuts[i] = new Nut();
        }
        return nuts;
    }
}
