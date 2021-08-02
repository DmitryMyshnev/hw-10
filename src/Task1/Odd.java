package Task1;

import java.util.List;

public class Odd {
    public String oddSort(List<String> names) {
        String res ="";
        int index = 1;
        for (String st : names) {
            if (index % 2 != 0) {
                res += index + "." + st + ", ";
            }
            index++;
        }
        return res;
    }
}
