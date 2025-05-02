import java.util.Random;
import java.util.Scanner;

public class MentalMaths {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner Keyboard = new Scanner(System.in);

        int a = rand.nextInt(100) + 1;
        int b = rand.nextInt(100) + 1;

        System.out.println("Eerste willekeurige getal: " + a);
        System.out.println("Tweede willekeurige getal: " + b);

        System.out.println("What is " + a + "+" + b + "?");
        int answer = Keyboard.nextInt();

        int correctAnswer = a + b;

        if (answer == correctAnswer) {
            System.out.println("Correct! well done.");
        } else {
            System.out.println("incorrect! the correct answer is " + correctAnswer);


        }
    }
}
