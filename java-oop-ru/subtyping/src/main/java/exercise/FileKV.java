package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    String fileAndPath;
    Map<String, String> map = new HashMap<>();
    public FileKV(String fileAndPath, Map<String, String> map) {
        this.fileAndPath = fileAndPath;
        this.map.putAll(map);
        Utils.writeFile(this.fileAndPath, Utils.serialize(this.map));
        System.out.println(Utils.serialize(this.map));
    }

    public void set(String key, String value) {
        this.map.put(key, value);
        Utils.writeFile(this.fileAndPath, Utils.serialize(this.map));
    }

    public void unset(String key) {
        this.map.remove(key);
        Utils.writeFile(this.fileAndPath, Utils.serialize(this.map));
    }

    @Override
    public String get(String key, String defaultValue) {
        String json = Utils.readFile(this.fileAndPath);
        map.putAll(Utils.unserialize(json));
        System.out.println(Utils.serialize(this.map));
        return (this.map.containsKey(key) ? map.get(key) : defaultValue);
    }

    public Map<String, String> toMap() {
        return null;
    }

}
// END
