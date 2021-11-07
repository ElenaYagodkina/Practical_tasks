import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PositiveList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(-3);
        list.add(7);

        System.out.println(list);

        List<Integer> positiveList = list.stream().flatMap(x -> {
            if (x < 0) { return Stream.of(-x);}
            return Stream.of(x);
        }).collect((Collectors.toList()));

        System.out.println(positiveList);
    }

}
