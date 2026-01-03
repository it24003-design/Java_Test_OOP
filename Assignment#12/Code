import java.util.Scanner;

public class Factorian_Number {
    static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++)
            fact = fact*i;
        return fact;
    }

    static boolean isFactorion(int num) {
        int orginal = num,sum=0;

        while(num > 0) {
            int digit = num % 10;
            sum = sum + factorial(digit);
            num = num/10;
        }

        return sum == orginal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();
        boolean found = false;

        for(int i=start; i<=end; i++) {
            if(isFactorion(i)) {
                if (!found)
                    System.out.println("Factorion numbers in the given range:");
                
                System.out.println(i);
                found = true;
            }
        }

        if (!found)
            System.out.println("No Factorion number found in this range.");

        sc.close();
    }
}
