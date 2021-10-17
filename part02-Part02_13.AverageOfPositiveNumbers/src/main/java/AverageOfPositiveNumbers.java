
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        int sumOfPositiveNumbers=0;
        int numberOfPositiveInputs=0;
        while (true){
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
            if (num==0){
                break;
            }
            if (num<0) {
                continue;
            }
            sumOfPositiveNumbers+=num; //Read as sum=sum+num
            numberOfPositiveInputs+=1;
        }
        if (sumOfPositiveNumbers!=0) {
            System.out.println((float) sumOfPositiveNumbers/numberOfPositiveInputs);
        } else if (sumOfPositiveNumbers==0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
