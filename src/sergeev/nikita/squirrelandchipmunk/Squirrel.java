package sergeev.nikita.squirrelandchipmunk;

import java.util.List;

public class Squirrel {
    private int countNuts = 0;
    private double weightNuts = 0;

    public void calculateNuts(Tree tree) {
        int listNutsSize = tree.getNumberNuts();
        List<Nut> listNuts = tree.getNuts();

        for (int i = 0; i < listNutsSize; i++) {
            System.out.println("ура, еще орех!");
            countNuts++;
            weightNuts = weightNuts + listNuts.get(i).getWeight();
        }

        System.out.printf("Насобирала(в граммах): %.2f%n", weightNuts);
        System.out.println("Насобирала(в штуках): " + countNuts);
    }

    public double getSumWeightNuts() {
        return weightNuts;
    }

    public int getSumNuts() {
        return countNuts;
    }

    public void resetCount() {
        countNuts = 0;
        weightNuts = 0;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "countNuts=" + countNuts +
                ", weightNuts=" + String.format("%.2f", weightNuts) +
                '}';
    }
}