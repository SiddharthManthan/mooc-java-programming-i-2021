
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        int inputNumber=0;
        int sum=0;
        ArrayList<Integer> numbers=new ArrayList();
        while (true) {
            inputNumber=Integer.valueOf(scanner.nextLine());
            if (inputNumber==-1) {
                break;
            }
            numbers.add(inputNumber);
            sum+=inputNumber;
        }
        float average=(float)sum/numbers.size();
        System.out.println("Average: "+average);
    }
}
