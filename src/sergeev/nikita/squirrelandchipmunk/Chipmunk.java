package sergeev.nikita.squirrelandchipmunk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chipmunk {
    private final Tree tree;
    private static final Random RND = new Random();
    private int countNuts = 0;
    private double weightNuts = 0;
    private final List<Nut> storageListNuts = new ArrayList<>();

    public Chipmunk(Tree tree) {
        this.tree = tree;
    }

    public void transferToStore() {
        storageListNuts.clear();
        List<Nut> listNuts = tree.getNuts();

        for (int i = 0; i < listNuts.size(); i++) {
            if (RND.nextDouble() < 0.75) {
                storageListNuts.add(listNuts.get(i));
            }
        }
    }

    public void calculateNuts() {
        countNuts = 0;
        weightNuts = 0;

        for (int i = 0; i < storageListNuts.size(); i++) {
            countNuts++;
            weightNuts = weightNuts + storageListNuts.get(i).getWeight();
        }

        System.out.println("На складе(в граммах): " + weightNuts);
        System.out.println("На складе(в штуках): " + countNuts);
    }

    public double getSumWeightNuts() {
        return weightNuts;
    }

    public int getSumNuts() {
        return countNuts;
    }

    @Override
    public String toString() {
        return "Chipmunk{" +
                "tree=" + tree +
                ", storageListNuts=" + storageListNuts +
                ", countNuts=" + countNuts +
                ", weightNuts=" + String.format("%.2f", weightNuts) +
                '}';
    }
}
