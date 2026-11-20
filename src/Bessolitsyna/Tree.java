package Bessolitsyna;


public class Tree {
    public Nut[] growNutArray (int count) {
        Nut[] nuts = new Nut[count];
        for (int i = 0; i< count; i++) {
            nuts[i] = new Nut();
        }
        return nuts;


    }
}