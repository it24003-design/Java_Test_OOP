import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner sc = new Scanner(inputFile);
            String line = sc.nextLine();
            sc.close();
            
            String[] numbersStr = line.split(",");
            StringBuilder output = new StringBuilder();
            
            for (int i = 0; i < numbersStr.length; i++) {
                int num = Integer.parseInt(numbersStr[i].trim());
                long sum = (long) num * (num + 1) / 2;
                
                output.append(sum);
                if (i != numbersStr.length - 1) {
                    output.append(", ");
                }
            }
            
            PrintWriter writer = new PrintWriter("output.txt");
            writer.println(output.toString());
            writer.close();
            
            System.out.println("Processing complete. Check output.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in input file.");
        }
    }
}
