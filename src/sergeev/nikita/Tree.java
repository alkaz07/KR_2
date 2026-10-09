package sergeev.nikita;

public class Tree {

    public Nut[] getGrowNutArray(int numberNuts) {
        Nut[] nutsArray = new Nut[numberNuts];

        for (int i = 0; i < numberNuts; i++) {
            nutsArray[i] = new Nut();
        }

        return nutsArray;
    }
}