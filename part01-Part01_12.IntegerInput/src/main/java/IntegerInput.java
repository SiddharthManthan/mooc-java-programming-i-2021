
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in);
        int number=Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number "+number);
    }
}
