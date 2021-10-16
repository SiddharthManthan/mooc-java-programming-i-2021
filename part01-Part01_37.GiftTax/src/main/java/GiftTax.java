
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        // Tax Data
        int value1Min=5000;
        int value1LowLimit=100;
        int value1ExceedingPercent=8;
        int value2Min=25000;
        int value2LowLimit=1700;
        int value2ExceedingPercent=10;
        int value3Min=55000;
        int value3LowLimit=4700;
        int value3ExceedingPercent=12;
        int value4Min=200000;
        int value4LowLimit=22100;
        int value4ExceedingPercent=15;
        int value5Min=1000000;
        int value5LowLimit=142100;
        int value5ExceedingPercent=17;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue=Integer.valueOf(scan.nextLine());
        int minValue=0;
        int lowLimit=0;
        int exceedingPecentage=0;
        
        if (giftValue >= value5Min){
            minValue=value5Min;
            lowLimit=value5LowLimit;
            exceedingPecentage=value5ExceedingPercent;
        } else if (giftValue >= value4Min && giftValue < value5Min) {
            minValue=value4Min;
            lowLimit=value4LowLimit;
            exceedingPecentage=value4ExceedingPercent;
        } else if (giftValue >= value3Min && giftValue < value4Min) {
            minValue=value3Min;
            lowLimit=value3LowLimit;
            exceedingPecentage=value3ExceedingPercent;
        } else if (giftValue >= value2Min && giftValue < value3Min) {
            minValue=value2Min;
            lowLimit=value2LowLimit;
            exceedingPecentage=value2ExceedingPercent;
        } else if (giftValue >= value1Min && giftValue < value2Min) {
            minValue=value1Min;
            lowLimit=value1LowLimit;
            exceedingPecentage=value1ExceedingPercent;
        } else if (giftValue < value1Min && giftValue >= 0) {
            System.out.println("No tax!");
            return; //TMC interrupted if System.exit() is used ?
            //System.exit(0); //Exit program without errors 
        } else {
            System.out.println("Invalid Value of gift");
            return;
            //System.exit(1); //Exit program with errors
        }
        
        double tax=(lowLimit+(((double)giftValue-minValue)*((double)exceedingPecentage/100)));
        System.out.println("Tax: "+tax);
    }
}
