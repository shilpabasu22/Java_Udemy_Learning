package udemy;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int sum=0;
        long average;
        while(true){
            System.out.println("Enter Number:");
            boolean hasValidNumber = scanner.hasNextInt();
            if(hasValidNumber){
                int number = scanner.nextInt();
                scanner.nextLine();
                sum = sum+number;

            }else{
                break;
            }
            counter++;
        }
        if(counter == 0){
            System.out.println("SUM = 0 AVG = 0");
        }else {
            average =Math.round((double)sum / (double)counter);
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
        scanner.close();
    }
}
