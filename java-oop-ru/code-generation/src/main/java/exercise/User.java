package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;


// BEGIN
@Value
@Getter
@AllArgsConstructor
// END

class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
