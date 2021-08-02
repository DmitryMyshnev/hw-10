package Task3;

import java.util.Arrays;

public class SortFromStream {
    public String[] splitAndSort(String[] array) {
        return Arrays.stream(array).flatMap((p) -> Arrays.stream(p.split(",")))
                .sorted()
                .toArray(String[]::new);
    }
}
