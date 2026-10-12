package sergeev.nikita.squirrelandchipmunk;

import java.util.List;

public class Squirrel {
    private final Tree tree;
    private int countNuts = 0;
    private double weightNuts = 0;

    public Squirrel(Tree tree) {
        this.tree = tree;
    }

    public void calculateNuts() {
        countNuts = 0;
        weightNuts = 0;
        int listNutsSize = tree.getNumberNuts();
        List<Nut> listNuts = tree.getNuts();

        for (int i = 0; i < listNutsSize; i++) {
            System.out.println("ура, еще орех!");
            countNuts++;
            weightNuts = weightNuts + listNuts.get(i).getWeight();
        }

        System.out.println("Насобирала(в граммах): " + weightNuts);
        System.out.println("Насобирала(в штуках): " + countNuts);
    }

    public double getSumWeightNuts() {
        return weightNuts;
    }

    public int getSumNuts() {
        return countNuts;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "tree=" + tree +
                ", countNuts=" + countNuts +
                ", weightNuts=" + String.format("%.2f", weightNuts) +
                '}';
    }
}