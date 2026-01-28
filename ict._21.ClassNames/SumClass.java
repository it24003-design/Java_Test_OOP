package ict._21.ClassNames;

public class SumClass {
    public static SumClass instance = new SumClass();
    private SumClass() {}

    public double CalculationSum() {
        double sum = 0.0;
        for(int i = 10; i >= 1; i--)  // floating-point issue fix
            sum += i / 10.0;
        return sum;
    }
}