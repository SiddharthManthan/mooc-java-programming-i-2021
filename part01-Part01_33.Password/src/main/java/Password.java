
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        String passwordCorrect="Caput Draconis";
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String passwordInput = scan.nextLine();
        if (passwordInput.equals(passwordCorrect)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
