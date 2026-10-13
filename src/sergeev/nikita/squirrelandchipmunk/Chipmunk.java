package sergeev.nikita.squirrelandchipmunk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chipmunk {
    private static final Random RND = new Random();
    private int countNuts = 0;
    private double weightNuts = 0;
    private final List<Nut> storageListNuts = new ArrayList<>();

    public void transferToStore(Tree tree) {
        List<Nut> listNuts = tree.getNuts();

        for (int i = 0; i < listNuts.size(); i++) {
            Nut nut = listNuts.get(i);

            if (RND.nextDouble() < 0.75) {
                storageListNuts.add(listNuts.get(i));
                countNuts++;
                weightNuts = weightNuts + nut.getWeight();
            }
        }

        System.out.printf("На складе(в граммах): %.2f%n", weightNuts);
        System.out.println("На складе(в штуках): " + countNuts);
    }

    public double getSumWeightNuts() {
        return weightNuts;
    }

    public int getSumNuts() {
        return countNuts;
    }

    public void resetCount() {
        storageListNuts.clear();
        countNuts = 0;
        weightNuts = 0;
    }

    @Override
    public String toString() {
        return "Chipmunk{" +
                "countNuts=" + countNuts +
                ", weightNuts=" + String.format("%.2f", weightNuts) +
                '}';
    }
}
