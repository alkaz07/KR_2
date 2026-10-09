package suvorin;

class Squirrel extends Animal {
    // Белка хранит счетчик и вес собранных орехов
    private int nutsCount;
    private float nutsWeight;

    @Override
    protected void stockNut(Nut nut) {
        System.out.println(this + ": Я нашла орех!");
        this.nutsCount++;
        this.nutsWeight += nut.weight;
    }

    @Override
    protected void sayMessage() {
        System.out.printf(
                this +
                        ": Я насобирала орехов: %d шт. с общим весом: %.2f грамм!\n",
                nutsCount, nutsWeight);
    }

    @Override
    public String toString() {
        return "Белочка";
    }
}