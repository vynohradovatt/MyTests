import org.example.SumCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

public class SumCalculatorTests {

    private SumCalculator sumCalculator;

    int a = 9;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThat1SumWorkCorrect(){

        Assertions.assertEquals(1,sumCalculator.sum(1));

    }

    @Test
    public void testThat3SumWorkCorrect(){

        Assertions.assertEquals(6,sumCalculator.sum(3));

    }
    @Test
    public void testThat0SumWorkCorrect(){

        Assertions.assertThrows(IllegalArgumentException.class, ()-> sumCalculator.sum(0));

    }
}
