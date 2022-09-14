import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FirstTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(new Random().nextInt() > 1);
    }
}
