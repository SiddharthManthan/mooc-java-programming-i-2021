
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        ArrayList<String> username=new ArrayList();
        ArrayList<Integer> age=new ArrayList();
        while(true) {
            input=scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] parts=input.split(",");
            username.add(parts[0]);
            age.add(Integer.valueOf(parts[1]));
        }
        int maxAge=-9999;
        int maxAgeIndex=0;
        for(int i=0; i<age.size();i++) {
            if (age.get(i)>maxAge) {
                maxAge=age.get(i);
                maxAgeIndex=i;
            }
        }
        System.out.println("Name of the oldest: "+username.get(maxAgeIndex));

    }
}
