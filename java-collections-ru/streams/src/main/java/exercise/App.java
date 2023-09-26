package exercise;

import java.util.List;

// BEGIN
public class App {
    public static long getCountOfFreeEmails (List<String> list){
        return list.stream()
                        .filter (s -> s.substring(s.indexOf("@")).contains("gmail.com") || s.substring(s.indexOf("@")).contains("yandex.ru") || s.substring(s.indexOf("@")).contains("hotmail.com"))
                        .count();
    }
}
// END
