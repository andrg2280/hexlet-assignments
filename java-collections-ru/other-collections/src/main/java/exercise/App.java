package exercise;

import java.util.*;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> result =new LinkedHashMap<>();
        Map<String, Object> mapS = new HashMap<>();
        mapS.putAll(map1);
        mapS.putAll(map2);
        mapS.forEach((key, value) -> result.put(key, customCompareByKeyValue(map1,map2,key)));
        return result;
        /* LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        Set<Map.Entry<String,Object>> set1=new HashSet<>(map1.entrySet()), set2=new HashSet<>(map2.entrySet());
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        Set<Map.Entry<String,Object>> uniqueSet1=new HashSet<>(set1);
        Set<Map.Entry<String,Object>> uniqueSet2=new HashSet<>(set2);
        Set<Map.Entry<String,Object>> uniqueSet3=new HashSet<>(set1);
        Set<Map.Entry<String,Object>> uniqueSet4=new HashSet<>(set2);
        uniqueSet1.removeAll(set2);
        uniqueSet2.removeAll(set1);
        uniqueSet3.retainAll(set2);
        uniqueSet4.retainAll(set1);
        System.out.println("MySet1: " + uniqueSet1);
        for (Map.Entry<String,Object> element : uniqueSet2) {
            linkedHashMap.put(element.getKey(), "added");
        }
        for (Map.Entry<String,Object> element : uniqueSet1) {
            linkedHashMap.put(element.getKey(), "deleted");
        }
        for (Map.Entry<String,Object> element : uniqueSet3) {
            linkedHashMap.put(element.getKey(), "changed");
        }
        for (Map.Entry<String,Object> element : uniqueSet4) {
            linkedHashMap.put(element.getKey(), "unchanged");
        }
        return linkedHashMap;*/
    }
    public static String customCompareByKeyValue(Map<String, Object> map1, Map<String, Object> map2, String key) {
        String result = "";
        boolean isEqual = false;
        boolean key11Exists = map1.containsKey(key);
        boolean key12Exists = map2.containsKey(key);
        if (key11Exists && key12Exists) {
            isEqual = map1.get(key).equals(map2.get(key));
        }
        if (!key11Exists && key12Exists) {
            result = "added";
        } else if (key11Exists && !key12Exists) {
            result = "deleted";
        } else if (key11Exists && !isEqual) {
            result = "changed";
        } else if (key11Exists) {
            result = "unchanged";
        }
        return result;
    }
}
//END
