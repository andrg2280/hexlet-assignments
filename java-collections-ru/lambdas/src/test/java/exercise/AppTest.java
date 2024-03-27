package exercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testenlargeArrayImage() {
        String[][] smallImage =
                        {{"*", "*", "*", "*"},
                        {"*", " ", " ", "*"},
                        {"*", " ", " ", "*"},
                        {"*", "*", "*", "*"}};
        String[][] expected =
                        {{"*", "*", "*", "*", "*", "*", "*", "*"},
                        {"*", "*", "*", "*", "*", "*", "*", "*"},
                        {"*", "*", " ", " ", " ", " ", "*", "*"},
                        {"*", "*", " ", " ", " ", " ", "*", "*"},
                        {"*", "*", " ", " ", " ", " ", "*", "*"},
                        {"*", "*", " ", " ", " ", " ", "*", "*"},
                        {"*", "*", "*", "*", "*", "*", "*", "*"},
                        {"*", "*", "*", "*", "*", "*", "*", "*"}};
        String[][] actual = App.enlargeArrayImage(smallImage);
        assertThat(actual).isEqualTo(expected);
    }
}
// END
