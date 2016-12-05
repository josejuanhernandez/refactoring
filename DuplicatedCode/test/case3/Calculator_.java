package case3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Calculator_ {

    @Test
    public void should_be_able_to_sum_numbers() {
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.sum(1, 10));
    }

    @Test
    public void should_be_able_to_sum_square_numbers() {
        Calculator calculator = new Calculator();
        assertEquals(385, calculator.sumOfSquares(1,10));
    }

}
