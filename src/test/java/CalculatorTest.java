import org.example.Calculator;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {
    @Test
    public void factorialOfZeroIsOne() {
        try {
            assertEquals(Calculator.calculateFactorial(0), BigInteger.ONE);
        }
        catch (Exception e) {
            fail("Exception thrown");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void factorialOfOneIsOne() {
        try {
            assertEquals(Calculator.calculateFactorial(1), BigInteger.ONE);
        }
        catch (Exception e) {
            fail("Exception thrown");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void factorialOfFiveIsOne() {
        try {
            assertEquals(Calculator.calculateFactorial(5), BigInteger.valueOf(120));
        }
        catch (Exception e) {
            fail("Exception thrown");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void factorialOfSix() {
        try {
            assertEquals(Calculator.calculateFactorial(6), BigInteger.valueOf(720));
        }
        catch (Exception e) {
            fail("Exception thrown");
            System.out.println(e.getMessage());
        }
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

        try {
            assertEquals(Calculator.getNFactorials(3), list);
        }
        catch (Exception e) {
            fail("Exception thrown");
            System.out.println(e.getMessage());
        }
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

        try {
            assertEquals(Calculator.getNFactorials(6), list);
        }
        catch (Exception e) {
            fail("Exception thrown");
            System.out.println(e.getMessage());
        }
    }
}
