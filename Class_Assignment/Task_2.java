import java.util.*;
public class HarshedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int n1 = n;

        while (n != 0) {
            x = x + n % 10;
            n = n / 10;
        }

        if (n1 % x == 0)
            System.out.println(x);
        else
            System.out.println(-1);
    }
}
