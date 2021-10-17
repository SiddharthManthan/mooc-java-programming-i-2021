
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNegativeInputs=0;
        int input=0;
        while(true){
            System.out.println("Give a number:");
            input=Integer.valueOf(scanner.nextLine());
            if (input==0){
                break;
            }       
            
            if (input<0){
                numberOfNegativeInputs+=1; //Read as numberOfnegativeInputs=numberOfNegativeInputs+1
            }
        }
        System.out.println("Number of negative numbers: "+numberOfNegativeInputs);
    }
}
