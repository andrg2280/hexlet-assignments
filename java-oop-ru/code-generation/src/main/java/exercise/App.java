package exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        String json = car.serialize();
        try (FileWriter fileWriter = new FileWriter(path.toAbsolutePath().toString(), true)) {
            fileWriter.write(json);
        }
    }
    public static Car  extract(Path path) throws IOException {
        String json = Files.readString(path);
        return Car.unserialize(json);
    }
}
// END
