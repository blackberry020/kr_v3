package org.example;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Calculator.getNFactorials(25));
            System.out.println(Calculator.calculateFactorial(100));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}