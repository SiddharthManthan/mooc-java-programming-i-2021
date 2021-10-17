
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num=0;
        int sum=0;
        int numberOfInputs=0;
        int evenInputs=0;
        int oddInputs=0;
        while (true) {
            num=Integer.valueOf(scanner.nextLine());
            if (num==-1) {
                break;
            }
            sum=sum+num; //Read as sum = sum + num
            numberOfInputs++;
            if (num%2==0) {
                evenInputs++;
            } else {
                oddInputs++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+numberOfInputs);
        System.out.println("Average: "+(float)sum/numberOfInputs);
        System.out.println("Even: "+evenInputs);
        System.out.println("Odd: "+oddInputs);        
    }
}
