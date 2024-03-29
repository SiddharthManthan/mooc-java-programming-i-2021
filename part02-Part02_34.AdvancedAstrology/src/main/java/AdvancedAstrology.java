
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i=1; i<=number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i=1; i<=size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i=1; i<=height;i++) {
            printSpaces(height-i);
            //Sequence of Odd Numbers to print odd number of stars every line
            printStars((2*i)-1);
        }
        printSpaces(height-2);
        System.out.println("***");
        printSpaces(height-2);
        System.out.println("***");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}