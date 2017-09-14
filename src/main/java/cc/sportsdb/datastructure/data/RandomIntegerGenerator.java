package cc.sportsdb.datastructure.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomIntegerGenerator implements IGenerator<Integer> {

    private int start;
    private int end;

    public RandomIntegerGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<Integer> generate(int size) {
        List<Integer> list = new ArrayList<>(size);
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < size; ++i) {
            list.add(start + random.nextInt(end));
        }

        return list;
    }
}
