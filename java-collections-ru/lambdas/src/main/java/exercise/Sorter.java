package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {

        return users.stream().filter(f -> f.containsValue("male")).sorted((o1,o2) -> {
            LocalDate firstDate = LocalDate.parse(o1.get("birthday"));
            LocalDate secondDate = LocalDate.parse(o2.get("birthday"));
            return firstDate.compareTo(secondDate);
        }).map(m -> m.get("name")).collect(Collectors.toList());
    }
}
// END
