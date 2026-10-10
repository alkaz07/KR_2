package lukianov.belochka;

import java.util.Random;

/**
 * Представляет Орешек (орех Орешника) с определённым весом.
 * Вес случайным образом определяется при создании в диапазоне от
 * {@link #NUT_MIN_WEIGHT} до {@link #NUT_MAX_WEIGHT}.
 */
public class Oreshek {
    /**
     * Фактор генетики, определяющий, какому орешку быть какого веса.
     */
    private final static Random genetics = new Random();
    /**
     * Минимальный вес орешка.
     */
    private final static double NUT_MIN_WEIGHT = 1.5;
    /**
     * Максимальный вес орешка.
     */
    private final static double NUT_MAX_WEIGHT = 12.5;

    /**
     * Вес орешка. Не меняется от создания до самого съедения.
     */
    private final double weight;

    /**
     * Создает новый орешек со случайным весом в генетически
     * оправданном диапазоне от {@link #NUT_MIN_WEIGHT} до {@link #NUT_MAX_WEIGHT}.
     */
    public Oreshek() {
        weight = NUT_MIN_WEIGHT
                + genetics.nextDouble() * (NUT_MAX_WEIGHT - NUT_MIN_WEIGHT);
    }

    /**
     * Возвращает вес орешка.
     */
    public double getWeight() {
        return weight;
    }
}
