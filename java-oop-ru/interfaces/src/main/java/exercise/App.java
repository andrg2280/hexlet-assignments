package exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {


    public static List<String> buildApartmentsList(List<Home> list, int n) {
        List<String> convertList = new ArrayList<>();
        System.out.println("paramList: " +list);
        List<Home> listFilterd = list.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .limit(n)
                .toList();
        System.out.println("myList: " +listFilterd);

        if (listFilterd != null) {
            for (Home list2: listFilterd) {
                String t = list2.toString();
                convertList.add(t);
            }
        }
        return convertList;
    }
}
// END
