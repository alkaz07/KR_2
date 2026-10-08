package krasotkin;

public class Tree{
    public Nut[] nuts;
    public Nut[] growNut(int countNuts){
        Nut[] n = new Nut[countNuts];
        for (int i = 0; i < countNuts; i++) {
            n[i] = new Nut();
        }
        return n;
    }
}