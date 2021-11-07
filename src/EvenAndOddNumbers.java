import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenAndOddNumbers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(8);

        System.out.println(list);

        List<Integer> evenOdd = list.stream().flatMap(x -> {
            if (x%2 == 0) { return Stream.of(x * 100);}
            else {return Stream.of(x - 100);}
        }).collect((Collectors.toList()));

        System.out.println(evenOdd);
    }
}
