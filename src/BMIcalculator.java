import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Enter your mass (kg): ");
        double a = Keyboard.nextDouble();
        System.out.println("Enter your height (m): ");
        double b = Keyboard.nextDouble();
        double bmi = a/(b*b);

        System.out.println("Your BMI is: " + bmi);

        if(bmi < 18.5){
        System.out.println("Ondergewicht");
        } else if(bmi>= 18.5 && bmi <= 24.9) {
        System.out.println("Gezond gewicht");
        } else if(bmi>=25.0 && bmi <= 29.9) {
        System.out.println("Overgewicht");
        } else {
        System.out.println("Obesitas");


        }
    }
}