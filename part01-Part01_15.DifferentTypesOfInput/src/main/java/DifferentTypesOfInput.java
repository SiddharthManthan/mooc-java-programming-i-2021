
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String value_string=scan.nextLine();
        System.out.println("Give an integer:");
        int value_integer=Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double value_double=Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean value_boolean=Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+value_string);
        System.out.println("You gave the integer "+value_integer);
        System.out.println("You gave the double "+value_double);
        System.out.println("You gave the boolean "+value_boolean);
    }
}
