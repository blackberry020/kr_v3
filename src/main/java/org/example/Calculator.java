package org.example;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculator {
    public static ArrayList<BigInteger> getNFactorials(int n) throws Exception {

        if (n < 0) {
            throw new Exception("the amount of numbers can't be negative");
        }

        ArrayList<BigInteger> factorials = new ArrayList<BigInteger>(n);

        for (int i = 0; i < n; i++) {
            factorials.add(calculateFactorial(i));
        }

        return factorials;
    }

    public static BigInteger calculateFactorial(int number) throws Exception {

        if (number < 0) {
            throw new Exception("The number can't be negative");
        }

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
