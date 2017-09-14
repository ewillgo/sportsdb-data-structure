package cc.sportsdb.datastructure.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringGenerator implements IGenerator<String> {

    private int start;
    private int end;

    private static final String[] CHARACTERS = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    public StringGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<String> generate(int size) {
        List<String> list = new ArrayList<>(size);
        Random random = new Random(System.currentTimeMillis());

        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < size; ++c) {
            for (int i = 0, length = start + random.nextInt(end); i < length; ++i) {
                sb.append(CHARACTERS[random.nextInt(CHARACTERS.length)]);
            }
            list.add(sb.toString());
            sb.setLength(0);
        }

        return list;
    }

}
