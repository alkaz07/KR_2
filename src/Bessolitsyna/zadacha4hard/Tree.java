package Bessolitsyna.zadacha4hard;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private double minWeight;
    private double maxWeight;
    private int level;
    private List<Nut> nuts;


    public Tree(double minWeight, double maxWeight, int startLevel) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.level = startLevel;
        this.nuts = new ArrayList<>();

    }
    public void levelUp() {
        level++;
    }
    public void growNuts() {
        nuts.clear();

        int maxNuts = level *5;
        int count = 1 + (int)(Math.random()*maxNuts);
        for (int i =0; i < count; i++) {
            nuts.add(new Nut(minWeight,maxWeight));

        }
        System.out.printf("Дерево уровня %s, вырастило %d орехов%n", level, count);

    }

    public List <Nut> getNuts(){

        return nuts;


    }
}
