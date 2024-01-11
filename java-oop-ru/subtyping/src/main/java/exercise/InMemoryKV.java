package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    Map<String, String> map = new HashMap<>();
    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void unset(String key) {
        this.map.remove(key);

    }

    @Override
    public String get(String key, String defaultValue) {
        return (this.map.containsKey(key) ? map.get(key) : defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.map);
    }
    public InMemoryKV(Map<String, String> map) {
        this.map.putAll(map);
    }
}
// END
