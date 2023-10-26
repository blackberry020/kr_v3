import org.example.Calculator;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test (expected = Exception.class)
    public void FactorialOfNegativeNumberCannotBeCalculated() throws Exception {
        Calculator.calculateFactorial(-6);
    }

    @Test (expected = Exception.class)
    public void NumberOfFactorialsIsNegativeWrong() throws Exception {
        Calculator.getNFactorials(-6);
    }

    @Test
    public void factorialOfZeroIsOne() throws Exception {
        assertEquals(Calculator.calculateFactorial(0), BigInteger.ONE);
    }

    @Test
    public void factorialOfOneIsOne() throws Exception {
        assertEquals(Calculator.calculateFactorial(1), BigInteger.ONE);
    }

    @Test
    public void factorialOfFiveIsOne() throws Exception {
        assertEquals(Calculator.calculateFactorial(5), BigInteger.valueOf(120));
    }

    @Test
    public void factorialOfSix() throws Exception {
        assertEquals(Calculator.calculateFactorial(6), BigInteger.valueOf(720));
    }

    @Test
    public void factorialOfFirstThreeNumbers() throws Exception {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>(
                Arrays.asList(
                        BigInteger.ONE,
                        BigInteger.ONE,
                        BigInteger.valueOf(2)
                )
        );

        assertEquals(Calculator.getNFactorials(3), list);
    }

    @Test
    public void factorialOfFirstSixNumbers() throws Exception {
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
