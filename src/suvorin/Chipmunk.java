package suvorin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Chipmunk extends Animal {
    // Бурундук хранит список орехов, которые он донес до склада
    private final List<Nut> stock;
    private final Random random = new Random();

    public Chipmunk() {
        stock = new ArrayList<Nut>();
    }

    @Override
    public String toString() {
        return "Бурундук";
    }

    @Override
    protected void stockNut(Nut nut) {
        if (random.nextDouble() < 0.75) {
            stock.add(nut);
        }
    }

    @Override
    protected void sayMessage() {
        System.out.printf(
                this +
                        ": Я донёс до склада орехов: %d шт. с общим весом: %.2f грамм!\n",
                stock.size(), getNutsWeight());
    }

    private float getNutsWeight() {
        float finalWeight = 0F;
        for (Nut nut : stock) {
            finalWeight += nut.weight;
        }

        return finalWeight;
    }
}