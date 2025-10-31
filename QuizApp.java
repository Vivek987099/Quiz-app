import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // object to represent a question
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?",
                new String[] { "1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai" }, 2));

        questions.add(new Question("Which language is used for Android development?",
                new String[] { "1. Python", "2. Kotlin", "3. Swift", "4. Ruby" }, 2));

        questions.add(new Question("Which planet is known as the Red Planet?",
                new String[] { "1. Venus", "2. Earth", "3. Mars", "4. Jupiter" }, 3));

        int score = 0;

        
        for (Question q : questions) {
            System.out.println("\n" + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (q.isCorrect(answer)) {
                System.out.println("Correct Answer! ");
                score++;
            } else {
                System.out.println("Wrong Answer!");
            }
        }

        //  Display  result
        System.out.println("\nYour final score is: " + score + " out of " + questions.size());

        sc.close();
    }

}
