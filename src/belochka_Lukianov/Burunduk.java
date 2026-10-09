package belochka_Lukianov;

import java.util.List;
import java.util.Random;

public class Burunduk implements NutGatherer {
    static final private Random fortune = new Random();

    private int totalNutsStored;
    private double totalWeightStored;
    private int totalNutsLost;

    private void transferToStorage(List<Oreshek> harvest) {
        for (Oreshek nut : harvest)
            if (fortune.nextDouble() <= 0.75) {
                totalNutsStored++;
                totalWeightStored += nut.getWeight();
            } else {
                totalNutsLost++;
            }
    }

    public double getStorageEfficiency() {
        int totalNutsGathered = totalNutsStored + totalNutsLost;
        return totalNutsGathered != 0 ?
                (double) totalNutsStored / totalNutsGathered :
                0;
    }

    @Override
    public void gatherFromTree(Oreshnik tree) {
        List<Oreshek> harvest = tree.getOreshki();
        transferToStorage(harvest);
        tree.getOreshki().clear();
    }

    @Override
    public void showSuperpower() {
        System.out.println("У меня на складе %d орехов, общей массой %.1f грамм!"
                .formatted(totalNutsStored, totalWeightStored));
    }
}
