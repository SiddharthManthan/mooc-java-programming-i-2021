
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();
        //System.out.print(first);
        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();
        //System.out.print(second);
        System.out.println("Thanks for sharing!");
    }
}
