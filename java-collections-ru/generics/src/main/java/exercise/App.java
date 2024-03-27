package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List findWhere(List<Map<String, String>> list, Map<String, String> where) {
        List<Map<String, String>> books = new ArrayList<>();
        for (var i = 0; i < list.size();i++) {
            Map map = list.get(i);
            if (equalMaps(map, where)) {
                books.add(map);
            }
        }
        return books;
    }
    private static boolean equalMaps(Map<String,String>m1, Map<String,String>m2) {
        for (String key: m2.keySet())
            if (!m1.get(key).equals(m2.get(key)))
                return false;
        return true;
    }
}
//END
