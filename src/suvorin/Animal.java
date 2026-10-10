package suvorin;

import java.util.List;

abstract class Animal {

    public void pickNuts(List<Nut> nutList) {
        for (Nut nut : nutList) {
            stockNut(nut);
        }

        sayMessage();
    }

    protected abstract void stockNut(Nut nut);

    protected abstract void sayMessage();
}