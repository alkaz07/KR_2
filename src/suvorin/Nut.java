package suvorin;

import java.util.Random;

class Nut {

    final float weight;

    Nut() {
        Random random = new Random();
        this.weight = (random.nextFloat(1.5F, 15.0F));
    };
}
