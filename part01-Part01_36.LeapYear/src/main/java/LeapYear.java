
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int inputYear=Integer.valueOf(scan.nextLine());
        Boolean isLeapYear=false;
        /* The parsing of conditional statements stops at the first condition 
           that is true.
           So first check if number divisible by 100 and 400 because if a number
           is divisible by 100 then it is also divisible by 4
        */
        // Year is a leap year if divisible by 100 and 400
        if (inputYear % 100 == 0) {
            if (inputYear % 400 == 0) {
                isLeapYear=true;
            }
        } else if (inputYear % 4 == 0) {
            isLeapYear=true;
        }
        if (isLeapYear){
            System.out.println("The year is a leap year.");
        } else if (!isLeapYear) {
            System.out.println("The year is not a leap year.");
        }
    }
}
