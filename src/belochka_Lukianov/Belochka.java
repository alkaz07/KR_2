package belochka_Lukianov;

public class Belochka implements NutGatherer {

    private int totalNutsGathered;
    private double totalWeightGathered;

    @Override
    public void gatherFromTree(Oreshnik tree) {
        for (Oreshek nut : tree.getOreshki()) {
            totalNutsGathered++;
            totalWeightGathered += nut.getWeight();
            System.out.println("Коллеги! Я с гордостью сообщаю, что, ура, ещё орех!");
        }
        tree.getOreshki().clear();
    }

    @Override
    public void showSuperpower() {
        System.out.printf("Я собрала %d орехов, общим весом в %.1f грамм!" +
                        " Но сколько смогу найти - точно не скажу!%n",
                        totalNutsGathered, totalWeightGathered);
    }
}
