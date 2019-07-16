package udemy.Classes.Arrays;
import java.util.Scanner;

public class Minimum {
private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int counter=0;
        System.out.println("How many numbers do you want to enter:");

        counter = scanner.nextInt();
        scanner.nextLine();

        int[] newArray  = readIntegers(counter);
        System.out.println("Minimum number in the array is: "+findMin(newArray));
    }

    public static int findMin(int[] numberArray){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<numberArray.length;i++){
            if(min>numberArray[i]){
                min=numberArray[i];
            }
        }
        return min;
    }

    public static int[] readIntegers(int count){
        int[] number = new int[count];
        System.out.println("Enter "+count + " numbers:");
        for(int i=0;i<number.length;i++){
            int counter = i+1;
            System.out.println("Enter Number " + counter + " : ");
            number[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return number;
    }
}
