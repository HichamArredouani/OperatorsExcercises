import java.util.Scanner;

public class Favouritism {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String Username = input.nextLine();

        String FavouriteName = "Hicham";

        if (Username.equals(FavouriteName)) {
        System.out.println("Aywaaaa baz hlik");
} else {
            System.out.println("Maar alle zeg wie is da makkakske nu" );
        }

    }
}
