package Deminov;

public class Tree {

    public Nut[] growingNuts(int qty) {

        Nut[] nutsArray = new Nut[qty];

        for (int i = 0; i < nutsArray.length; i++) {
            nutsArray[i] = new Nut();
        }
        return nutsArray;
    }
}
