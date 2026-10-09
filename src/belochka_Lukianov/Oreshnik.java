package belochka_Lukianov;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Oreshnik {
    private static final Random genetics = new Random();
    private static final Random weather = new Random();

    private int level;
    private final List<Oreshek> oreshki = new ArrayList<>();


    public void upgrade() {
        level++;
    }

    public List<Oreshek> getOreshki() {
        return oreshki;
    }

    public int getLevel() {
        return level;
    }

    public void growNuts() {
        if (oreshki.isEmpty()) {
            int production = weather.nextInt(level);
            IntStream.range(0, production)
                    .forEach(_ -> oreshki.add(new Oreshek()));
        }
    }

    public Oreshnik(int level) {
        this.level = level;
    }

    public Oreshnik() {
        this(genetics.nextInt(9) + 3);
    }


}
