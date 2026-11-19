package smirnov;

public class Tree {
    Nut[] growNutArray(int amount) {
        Nut[] nuts = new Nut[amount];
        for (int i = 0; i < amount; i++) {
            nuts[i] = new Nut();
        }
        return nuts;
    }
}
