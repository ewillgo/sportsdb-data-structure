package cc.sportsdb.datastructure.data;

import java.util.ArrayList;
import java.util.List;

public class RangeIntegerGenerator implements IGenerator<Integer> {

    @Override
    public List<Integer> generate(int size) {
        List<Integer> list = new ArrayList<>(size);

        for (int i = 1; i <= size; ++i) {
            list.add(i);
        }

        return list;
    }

}
