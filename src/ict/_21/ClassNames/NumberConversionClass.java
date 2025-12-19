package ict._21.ClassNames;

public class NumberConversionClass {
    public static NumberConversionClass instance = new NumberConversionClass();
    private NumberConversionClass() {}

    public String decimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public String decimalToHexa(int n) {
        return Integer.toHexString(n);
    }

    public String decimalToOctal(int n) {
        return Integer.toOctalString(n);
    }

    public int binaryToDecimal(String bin) {
        return Integer.parseInt(bin, 2);
    }

    public int hexaToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public int octalToDecimal(String oct) {
        return Integer.parseInt(oct, 8);
    }
}