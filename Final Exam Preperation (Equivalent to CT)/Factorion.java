import java.util.Scanner;

public class Factorion {

    static int[] factorial = new int[10];
    
    static {
        factorial[0] = 1;
        for (int i = 1; i <= 9; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }

    public static boolean isFactorion(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial[digit];
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upper = sc.nextInt();

        System.out.println("Factorion numbers in the range:");

        boolean first = true;
        for (int i = lower; i <= upper; i++) {
            if (isFactorion(i)) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        sc.close();
    }
}
