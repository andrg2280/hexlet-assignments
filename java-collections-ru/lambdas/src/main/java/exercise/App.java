package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String[] duplicate(String[] items) {
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item, item}).peek(System.out::println))
                .toArray(String[]::new);
    }

    public static String[][] enlargeArrayImage(String[][] image) {

        String[][] horizontalyLine = Arrays.stream(image)
                .map(App::duplicate).peek(System.out::println)
                .toArray(String[][]::new);

        return Arrays.stream(horizontalyLine)
                .flatMap(item -> Arrays.stream(new String[][] {item, item}))
                .toArray(size -> new String[size][]);
    }
}
// END
