package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual = App.take(numbers1, 2);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        System.out.println(App.take(numbers1, 2));
        assertThat(actual).isEqualTo(expected);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> actual2 = App.take(numbers2, 8);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        System.out.println(App.take(numbers2, 8));
        assertThat(actual2).isEqualTo(expected2);
        // END
    }
}
