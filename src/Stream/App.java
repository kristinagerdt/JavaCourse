package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        Collections.sort(names, (a, b) -> b.compareTo(a));


        Consumer<String> c = s -> System.out.println(s);
        Consumer<String> c2 = System.out::println;

        final int num = 1;
        Consumer<String> cons  = (from) -> String.valueOf(from + num);

        int num2 = 1;
        Consumer<String> cons2 = (from) -> String.valueOf(from + num2);

        int num3 = 1;
        Consumer<String> cons3 = (from) -> String.valueOf(from + num3);
//        num3 = 3;

    }

}
