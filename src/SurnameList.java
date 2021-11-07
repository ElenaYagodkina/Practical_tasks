import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SurnameList {

    public static void main(String[] args) {
        Collection<String> surname = new ArrayList();
        surname.add("Ivanov");
        surname.add("Andreev");
        surname.add("Smirnova");
        surname.add("Shvedov");
        surname.add("Antonov");

        System.out.println(surname);

        List<String> select = surname.stream().filter((s) -> s.contains("A")).collect(Collectors.toList());
        System.out.println(select);
    }
}
