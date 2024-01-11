package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
public class App implements KeyValueStorage {


    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> map = new HashMap<>();
        for(Map.Entry<String, String> entry : storage.toMap().entrySet()){
            String newKey = entry.getValue();
            String newValue = entry.getKey();
            storage.unset(entry.getKey());
            storage.set(newKey, newValue);
        }
        // Map<String, String> swapped = storage.toMap().entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public void set(String key, String value) {

    }

    public void unset(String key) {

    }

    public String get(String key, String defaultValue) {
        return null;
    }

    public Map<String, String> toMap() {
        return null;
    }
}
// END
