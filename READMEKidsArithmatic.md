import java.util.Scanner;

class KidsArithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            int score = 0;
            int ans;
            while (true) {
                System.out.println("\n1) What is 2 + 3 ?");
                System.out.println("1. 6");
                System.out.println("2. 7");
                System.out.println("3. 5");
                System.out.println("4. 9");
                System.out.print("Enter your answer:");
                ans = sc.nextInt();
                if (ans == 3) {
                    System.out.println("Congratulations! You got one marks.");
                    score++;
                    break;
                } 
                else {
                    System.out.println("Wrong! Try again.");
                }
            }
            while (true) {
                System.out.println("\n2) What is 15 - 9 ?");
                System.out.println("1. 5");
                System.out.println("2. 6");
                System.out.println("3. 7");
                System.out.println("4. 8");
                System.out.print("Enter your answer:");
                ans = sc.nextInt();
                if (ans == 2) {
                    System.out.println("Congratulations! You got one marks.");
                    score++;
                    break;
                } 
                else {
                    System.out.println("Wrong! Try again.");
                }
            }
            while (true) {
                System.out.println("\n3) What is 5 * 2 ?");
                System.out.println("1. 6");
                System.out.println("2. 8");
                System.out.println("3. 10");
                System.out.println("4. 12");
                System.out.print("Enter your answer:");
                ans = sc.nextInt();
                if (ans == 3) {
                    System.out.println("Congratulations! You got one marks.");
                    score++;
                    break;
                } 
                else {
                    System.out.println("Wrong! Try again.");
                }
            }
            while (true) {
                System.out.println("\n4) What is 15 / 3 ?");
                System.out.println("1. 2");
                System.out.println("2. 3");
                System.out.println("3. 4");
                System.out.println("4. 5");
                System.out.print("Enter your answer:");
                ans = sc.nextInt();
                if (ans == 4) {
                    System.out.println("Congratulations! You got one marks.");
                    score++;
                    break;
                } 
                else {
                    System.out.println("Wrong! Try again.");
                }
            }
            System.out.println("Your Score: " + score + " out of 4");
            System.out.println("\nPress 1 to Play Again");
            System.out.println("Press 0 to Exit");
            choice = sc.nextInt();
        } 
        while (choice == 1);
        System.out.println("\nThank you for playing");
        sc.close();
    }
}
