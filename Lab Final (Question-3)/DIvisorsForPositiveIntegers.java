import java.util.Scanner;

public class DIvisorsForPositiveIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        while (choice == 'y' || choice == 'Y') {

            int n;
            while (true) {
                System.out.print("Please enter a positive integer: ");
                n = sc.nextInt();

                if (n > 0)
                    break;
                else
                    System.out.println(n + " is not a positive integer.\n");
            }

            // Print divisors in decreasing order
            for (int i = n; i >= 1; i--) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }

            // Ask user again
            while (true) {
                System.out.print("\nWould you like to see the divisors of another integer (Y/N)? ");
                choice = sc.next().charAt(0);

                if (choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n')
                    break;
                else
                    System.out.println("\nPlease respond with Y (or y) for yes and N (or n) for no.");
            }
        }

        sc.close();
    }
}
