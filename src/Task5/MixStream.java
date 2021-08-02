package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixStream {
    public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondtList = second.collect(Collectors.toList());
        List<T> res = new ArrayList<>();
        int count = 0;
        while (count < firstList.size() && count < secondtList.size()) {
            res.add(firstList.get(count));
            res.add(secondtList.get(count));
            count++;
        }
        return res.stream();
    }

}
