package udemy;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        do{
            System.out.println("Enter number #"+count+":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int nextInt = scanner.nextInt();
                sum=sum+nextInt;
                count++;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }while(count<=10);
        System.out.println("Sum of 10 numbers is: "+sum);
        scanner.close();
    }
}
