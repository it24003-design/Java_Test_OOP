package ict._21.ClassNames;

public class MainClass {
    public static void main(String[] args) {
        double sum = SumClass.instance.CalculationSum();
        System.out.println("Sum = " + sum);

        int a = 12, b = 18;
        System.out.println("GCD = " + DivisorMultipleClass.instance.gcd(a, b));
        System.out.println("LCM = " + DivisorMultipleClass.instance.lcm(a, b));

        int num = 25;
        System.out.println("Binary = " + NumberConversionClass.instance.decimalToBinary(num));
        System.out.println("Hexa = " + NumberConversionClass.instance.decimalToHexa(num));
        System.out.println("Octal = " + NumberConversionClass.instance.decimalToOctal(num));

        CustomPrintClass.instance.pr();
    }    
}
