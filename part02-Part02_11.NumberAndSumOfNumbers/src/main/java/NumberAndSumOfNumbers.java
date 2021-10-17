
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        int sum=0;
        int numberOfInputs=0;
        while (true){
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
            if (num==0){
                break;
            }
            sum+=num; //Read as sum=sum+num
            numberOfInputs+=1;
        }
        System.out.println("Number of numbers: "+numberOfInputs);
        System.out.println("Sum of the numbers: "+sum);
    }
}
