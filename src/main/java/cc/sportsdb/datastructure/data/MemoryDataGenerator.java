package cc.sportsdb.datastructure.data;

import java.util.List;

public final class MemoryDataGenerator {

    private MemoryDataGenerator() {
    }

    public static List<Integer> generateInteger(int size) {
        return generate(size, new RangeIntegerGenerator());
    }

    public static List<Integer> generateRandomInteger(int size, int start, int end) {
        return generate(size, new RandomIntegerGenerator(Math.min(start, end), Math.max(start, end)));
    }

    public static List<String> generateString(int size, int start, int end) {
        return generate(size, new StringGenerator(Math.min(start, end), Math.max(start, end)));
    }

    public static <T> List<T> generate(int size, IGenerator<T> iGenerator) {
        return iGenerator.generate(size);
    }

}
