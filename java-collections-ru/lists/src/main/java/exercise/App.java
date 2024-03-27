package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App{
    public static boolean scrabble(String symbolSet, String word) {
        String[] strWord = word.toUpperCase().split("");
        List<String> listWord = new ArrayList<>( Arrays.asList(strWord));
        List<Boolean> listMatch = new ArrayList<>();
        for (String w : listWord) {
           if (countOccurrences(w,symbolSet) == countOccurrences(w,word)) {
               listMatch.add(true);
           } else {
               listMatch.add(false);
           }
            listMatch.contains(false);
        }
        return listMatch.contains(false);
    }
    private static int countOccurrences(String symbol, String str) {
        return str.length() - str.replace(symbol, "").length();
    }
}
//END
