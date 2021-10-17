
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=Integer.valueOf(scanner.nextLine());
        if (input < 0){
            input*=-1; //Read as input = input * -1
        }
        System.out.println(input);
    }
}
