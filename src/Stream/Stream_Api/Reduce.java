package Stream.Stream_Api;

import java.util.Arrays;
import java.util.Collection;

public class Reduce {
    // Метод reduce позволяет выполнять агрегатные функции на всей коллекцией (такие как сумма, нахождение минимального или максимального значение и т.п.)
    // Он возвращает одно Optional значение
    public static void showReduce() {
        System.out.println("Reduce start");

        // ************ Работа с числовыми объектами
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 2);

        // Вернуть сумму
        Integer sum = collection
                .stream()
                .reduce((s1, s2) -> s1 + s2)
                .orElse(0); // через stream Api
        Integer sumOld = 0; // по старому методу
        for (Integer i : collection) {
            sumOld += i;
        }
        System.out.println("sum = " + sum + " : " + sumOld); // напечатает sum = 12 : 12
    }
}
