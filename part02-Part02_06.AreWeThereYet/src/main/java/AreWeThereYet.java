
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        int num=0;
        Scanner scanner = new Scanner(System.in);
        while(num!=4){
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
        }
    }
}
