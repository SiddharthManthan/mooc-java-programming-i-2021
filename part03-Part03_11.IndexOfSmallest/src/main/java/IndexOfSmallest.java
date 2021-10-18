
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers= new ArrayList();        
        int num=0;
        while(true) {
            num=Integer.valueOf(scanner.nextLine());
            if (num==9999) {
                break;
            }
            numbers.add(num);
        }
        int smallestNumber=findSmallestNum(numbers);
        System.out.println("Smallest number: "+smallestNumber);
        findNumberIndex(smallestNumber, numbers);
    }
    
    static int findSmallestNum(ArrayList<Integer> numbers) {
        int smallestNumber=numbers.get(0);
        for (int num : numbers) {
            if (num<smallestNumber) {
                smallestNumber=num;
            }
        }
        return smallestNumber;
    }
    
    static void findNumberIndex(int numToFind, ArrayList<Integer> numbers) {
        for(int i=0;i<numbers.size();i++) {
            if (numbers.get(i)==numToFind) {
                System.out.println("Found at index: "+i);
            }
        }
    }
}
