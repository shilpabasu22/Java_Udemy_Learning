package udemy;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber=0;
        int minNumber = 0;
        boolean first = true;
        while(true){
            System.out.println("Enter Number:");
            boolean isAValidNumber = scanner.hasNextInt();
            if(isAValidNumber){
                int number = scanner.nextInt();
                if(first){
                    minNumber = number;
                    maxNumber = number;
                    first = false;
                }
                if(number<minNumber){
                    minNumber=number;
                }
                if(number>maxNumber){
                    maxNumber = number;
                }

            }else{
                break;
            }
            scanner.nextLine();

        }
        System.out.println("Min Number: "+minNumber);
        System.out.println("Max Number: "+maxNumber);
        scanner.close();
    }
}
