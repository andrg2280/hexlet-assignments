package exercise;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables (String confInputData) {
        List<String> configList = new ArrayList<>(Arrays.asList(confInputData.split("\\[(.*?)\\]")));
        return configList.stream()
                .filter(str -> !str.isEmpty())
                .filter(str -> str.startsWith("\nenvironment"))
                .map(str -> str.substring(str.indexOf("environment=\"")+13, str.indexOf("\"", 14)))
                .map(str -> str.replaceAll("\"",""))
                .map(str -> str.replaceAll("\\s",""))
                .flatMap(item -> Arrays.stream(item.split(","))
                        .filter(str -> str.startsWith("X_FORWARDED_")))
                .map(str -> str.replaceAll("X_FORWARDED_",""))
                .map(str -> str.replaceAll(",$",""))
                .collect(Collectors.joining(","));
    }
}
//END

