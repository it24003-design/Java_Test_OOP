package ict._21.ClassNames;

public class CustomPrintClass {
    public static CustomPrintClass instance = new CustomPrintClass();
    private CustomPrintClass() {}

    public void pr() {
        System.out.println("Custom Print Method Called!");
    }
}