
import Task1.Odd;
import Task2.UpperCaseName;
import Task3.SortFromStream;
import Task4.Rnd;
import Task5.MixStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//----------Task1
        List<String> names = Arrays.asList("Amato", "Bell", "Pol", "Jon", "Una", "Jin", "Nikon", "Tatum", "Woldemar", "Horn", "Sam", "Quby", "Jason");
        Odd odd = new Odd();
        odd.oddSort(names);
//------Task2
        UpperCaseName upperCaseName = new UpperCaseName();
        upperCaseName.toUpperName(names);
//-------Task3
        String[] arr = new String[]{"1,2,0", "4,5"};
        SortFromStream sortFromStream = new SortFromStream();
        sortFromStream.splitAndSort(arr);
//-------Task4
        Stream.generate((new Rnd()::nextLine)).limit(5).forEach(System.out::println);
//-------Task5
        Stream st1 = Stream.of(1, 3, 5, 7, 9);
        Stream st2 = Stream.of(2, 4, 6, 8);

        MixStream mixStream = new MixStream();
        Stream res = mixStream.zip(st1, st2);
        res.forEach(System.out::println);
    }


}
