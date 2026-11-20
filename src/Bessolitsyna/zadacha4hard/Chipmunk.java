package Bessolitsyna.zadacha4hard;

import java.util.ArrayList;
import java.util.List;

public class Chipmunk {
    List<Nut> storage = new ArrayList<>();

    public void collectNuts(Tree tree) {
        List<Nut> treeNuts = tree.getNuts();

        for (Nut nut : treeNuts) {
            // Вероятность 75%
            if (Math.random() <= 0.75) {
                storage.add(nut); // Донес до склада
            }
        }
    }

    public void showResults() {
        double totalWeight = 0;
        for (Nut nut : storage) {
            totalWeight += nut.weightNut;
        }
        System.out.printf("Бурундук донес до склада %d орехов, общим весом %.2f гр.%n",
                storage.size(), totalWeight);
    }
}