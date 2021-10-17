
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int input=0;
        while(true){
            System.out.println("Give a number:");
            input=Integer.valueOf(scanner.nextLine());
            if (input==0){
                break;
            }
            sum=sum+input;
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}
