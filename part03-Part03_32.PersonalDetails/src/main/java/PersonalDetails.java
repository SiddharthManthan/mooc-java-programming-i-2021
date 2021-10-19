
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        ArrayList<String> names=new ArrayList();
        ArrayList<Integer> birthYear=new ArrayList();
        int nameLength=0;
        int noOfInputs=0;
        int sumOfYears=0;
        String longestName="None";
        while(true) {
            input=scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] parts=input.split(",");
            names.add(parts[0]);
            birthYear.add(Integer.valueOf(parts[1]));
            noOfInputs++;
            //Find Length of Largest Name
            if (parts[0].length()>nameLength) {
                nameLength=parts[0].length();
                longestName=parts[0];
            }
            //Sum of Birth years
            sumOfYears+=Integer.valueOf(parts[1]);
        }
        //ToDo: Fix for multiple names
        //Print Multiple Longest Name
        /*
        for (int i=0;i<names.size();i++) {
            if (names.get(i).length()==nameLength){
                System.out.print(names.get(i));
                if (i<names.size()) {
                    System.out.print(", ");
                }
            }
        }
        */
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+(float)sumOfYears/noOfInputs);
    }
}
