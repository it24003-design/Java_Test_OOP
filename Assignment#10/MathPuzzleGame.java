import java.io.*;
import java.util.*;

public class MathPuzzleGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter player name: ");
        String PlayerName = sc.nextLine();

        System.out.print("Enter difficulty (Easy/Medium/Hard): ");
        String difficulty = sc.nextLine().toLowerCase();

        int score = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String level = data[0];
                String question = data[1];
                int CorrectAnswer = Integer.parseInt(data[2]);

                if (level.equals(difficulty)) {
                    System.out.print("Solve: " + question + " = ");
                    int UserAnswer = sc.nextInt();

                    if (UserAnswer == CorrectAnswer) {
                        System.out.println("Correct!");
                        score = score + 5;
                    } else {
                        System.out.println("Wrong Answer! Correct answer is = " + CorrectAnswer);
                    }
                }
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("score.txt", true));
            bw.write(PlayerName + "," + difficulty + "," + score);
            bw.newLine();
            bw.close();

            System.out.println("\nGame Over!");
            System.out.println("Final Score: " + score);

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}
