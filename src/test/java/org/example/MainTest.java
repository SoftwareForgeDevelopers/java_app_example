package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainTest {

    @Test
    public void testSumFunction() {
        Main main = new Main();
        assert main.sumFunction(1, 2) == 3;
    }

    @Test
    public void testSubFunction() {
        Main main = new Main();
        assert main.subFunction(1, 2) == -1;
    }

}
