package org.example;

public class CalculationEngine {

    private DBGateForCalculations dbGate;

    CalculationEngine(DBGateForCalculations gate) {
        dbGate = gate;
    }

    public DBGateForCalculations getDbGate() {
        return dbGate;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}

