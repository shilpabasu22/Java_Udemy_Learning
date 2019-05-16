package udemy;

import java.util.ArrayList;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number) {
        String returnValue = "";
        int numberDivisor = 1;
        if (number < 1) {
            returnValue = "Invalid Value";
            System.out.println( returnValue);
        } else {

            do {
                int temp = number % numberDivisor;
                if (temp == 0) {
                    returnValue = returnValue + numberDivisor + "\n";
                }
                numberDivisor++;
            } while (numberDivisor <= number);
            System.out.println(returnValue);
        }
    }
}
