import org.example.Calculator;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void factorialOfZeroIsOne() {
        assertEquals(Calculator.calculateFactorial(0), BigInteger.ONE);
    }

    @Test
    public void factorialOfOneIsOne() {
        assertEquals(Calculator.calculateFactorial(1), BigInteger.ONE);
    }

    @Test
    public void factorialOfFiveIsOne() {
        assertEquals(Calculator.calculateFactorial(5), BigInteger.valueOf(120));
    }

    @Test
    public void factorialOfSix() {
        assertEquals(Calculator.calculateFactorial(6), BigInteger.valueOf(720));
    }

    @Test
    public void factorialOfFirstSixNumbers() {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>(
                Arrays.asList(
                        BigInteger.ONE,
                        BigInteger.ONE,
                        BigInteger.valueOf(2),
                        BigInteger.valueOf(6),
                        BigInteger.valueOf(24),
                        BigInteger.valueOf(120)
                )
        );

        assertEquals(Calculator.getNFactorials(6), list);
    }
}
