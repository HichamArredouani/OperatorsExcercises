import java.util.Scanner;

public class PostageStamps {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your letter's mass: ");
        double massa = input.nextDouble();

        int zegels = 1;
        if (massa > 40) {
            zegels = 2;
        }
    System.out.println("Je hebt " + zegels +" zegels nodig. ");

}
}
