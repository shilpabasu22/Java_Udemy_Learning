package udemy.Classes.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to add:");
        counter = scanner.nextInt();
        scanner.nextLine();
        int[] originalArray = new int[counter];
        for(int i=0;i<counter;i++){
            int count = i+1;
            System.out.println("Enter Number " + count + " : ");
            originalArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        reverse(originalArray);

        scanner.close();

    }

    public static void reverse(int[] originalArray){
        int[] reverseArray = new int[originalArray.length];

        System.out.println("Original Array: "+ Arrays.toString(originalArray));


        System.out.println();
        int count=originalArray.length;
        for(int i=0;i<originalArray.length;i++){
            reverseArray[i] = originalArray[count-1];
            count--;

        }
        System.out.println("Reverse Array: "+Arrays.toString(reverseArray));

    }
}
