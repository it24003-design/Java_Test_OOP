import java.util.Scanner;

public class ObayetQuiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("Which one is not a Union of Delduar?");
            System.out.println(" 1.Atia \n 2.Elasin \n 3.Dewli \n 4.Silimpur\n");
            System.out.print("Enter your answer : ");
            choice = sc.nextInt();

            if(choice == 4) {
                System.out.println("Congratulations! You got 10 marks.");
                break;
            }
            else
                System.out.println("Wrong answer! Try again.");
        }
        sc.close();

    }
    
}
