package exercise;

import java.util.HashMap;
import java.util.Map;


// BEGIN
public class App {
    public static Map getWordCount (String sentence) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++)                        //iterate over the pairs
        {
            if (!words[i].isEmpty()) {
                map.put(words[i], countOccurrences (sentence, words[i]));
            }
                     //add them to the hashmap and trim whitespaces
        }
        return map;
    }
    public static String toString (Map<String, Integer> map){
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result = result + "\n  " + entry.getKey() + ": " + entry.getValue();
        }
        if (!result.isEmpty()) {
            result = result + "\n";
        }
        return "{" + result + "}";
    }
    public static int countOccurrences (String text, String str)
    {
        if (text.isEmpty() || str.isEmpty()) {
            return 0;
        }

        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }

        return count;
    }

}
//END
