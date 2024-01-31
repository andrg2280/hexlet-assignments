package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
    private static final List<String> notValidFields = new ArrayList<>();

    public static Map<String, List<String>> advancedValidate(Address address) throws IllegalAccessException {
        Map<String, List<String>> resMap = new HashMap<>();
        List<String> messages = new ArrayList<>();
        var fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            boolean addField = false;
            NotNull notNull = field.getAnnotation(NotNull.class);
            MinLength minLength = field.getAnnotation(MinLength.class);
            if (notNull != null) {
                if (field.get(address) == null) {
                    messages.add("can not be null");
                    addField = true;
                }
            }
            if (minLength != null) {
                int lenght =  field.get(address).toString().length();
                if (lenght < minLength.minLength()) {
                    messages.add("length less than " + minLength.minLength());
                    addField = true;
                }
            }
            if (addField) {
                List<String> listForInsert = List.copyOf(messages);

                resMap.put(field.getName(), listForInsert);

                messages.clear();
            }
        }
        return resMap;
    }

    public static List<String> validate(Address address) throws IllegalAccessException {

        var fields = address.getClass().getDeclaredFields();
        notValidFields.clear();
        for (Field field : fields) {
            NotNull info = field.getAnnotation(NotNull.class);
            field.setAccessible(true);
            if (field.getAnnotation(NotNull.class) != null) {
                if (field.get(address) == null) {
                    notValidFields.add(field.getName());
                }
            }
        }
        return notValidFields;
    }
}
// END
