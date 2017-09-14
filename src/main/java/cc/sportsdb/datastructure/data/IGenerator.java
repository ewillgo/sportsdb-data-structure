package cc.sportsdb.datastructure.data;

import java.util.List;

public interface IGenerator<T> {
    List<T> generate(int size);
}
