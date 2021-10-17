
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int larger=0;
        if (number1>number2) {
            if (number1>number3) {
                larger=number1;
            } else if (number3>number1) {
                larger=number3;
            }
        } else if (number2>number1) {
            if (number2>number3) {
                larger=number2;
            } else if (number3>number2) {
                larger=number3;
            }
        } else if (number1==number2 && number2==number3) {
            larger=number1;
        }
        return larger;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
