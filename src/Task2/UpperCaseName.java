package Task2;

import java.util.Comparator;
import java.util.List;

public class UpperCaseName {
    public List<String> toUpperName(List<String> names) {
        return names.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
