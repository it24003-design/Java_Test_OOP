import java.io.*;
import java.util.*;

public class General_Knowledge_QUIZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.print("Enter Student name :");
        String name = sc.nextLine();

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
            String line;

            while((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String question = data[0];
                String CorrectAnswer = data[1];

                System.out.print(question + " ");
                String UserAnswer = sc.nextLine();

                if(UserAnswer.equalsIgnoreCase(CorrectAnswer)) {
                    System.out.println("Correct answer!");
                    score = score+5;
                }
                else {
                    System.out.println("Wrong answer! Correct answer is: " + CorrectAnswer);
                }
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt",true));
            bw.write(name + "Score : " + score);
            bw.newLine();
            bw.close();

            System.out.println("\nQuiz Finished!");
            System.out.println("Final score: " + score);
        }
        catch(IOException e) {
            System.out.println("File error occured.");
        }

        sc.close();
    }
}