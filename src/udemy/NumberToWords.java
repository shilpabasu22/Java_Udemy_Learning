package udemy;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    public static void numberToWords(int number){
        int reverseNumber = reverse(number);
        String digitToWord="";
        String finalString="";

        int numberCount = getDigitCount(number);
        int reverseCount = getDigitCount(reverseNumber);
        String interimString = "";
        if(number<0 || reverseNumber <0){
            System.out.println("Invalid Value");
        }
        else {

            do {
                int lastDigit = reverseNumber % 10;
                switch (lastDigit) {
                    case 0: {
                        digitToWord = "Zero";
                        break;
                    }
                    case 1: {
                        digitToWord = "One";
                        break;
                    }
                    case 2: {
                        digitToWord = "Two";
                        break;
                    }
                    case 3: {
                        digitToWord = "Three";
                        break;
                    }
                    case 4: {
                        digitToWord = "Four";
                        break;
                    }
                    case 5: {
                        digitToWord = "Five";
                        break;
                    }
                    case 6: {
                        digitToWord = "Six";
                        break;
                    }
                    case 7: {
                        digitToWord = "Seven";
                        break;
                    }
                    case 8: {
                        digitToWord = "Eight";
                        break;
                    }
                    case 9: {
                        digitToWord = "Nine";
                        break;
                    }
                }
                finalString = finalString + " " + digitToWord;
                reverseNumber = reverseNumber / 10;

            } while (reverseNumber > 0);

            if (numberCount != reverseCount) {
                int difference = numberCount - reverseCount;
                for (int i = 0; i < difference; i++) {
                    interimString = interimString + " Zero";
                }
                finalString = finalString + interimString;
            }
            System.out.println(finalString);
        }
    }




    public static int reverse(int number){
        int tempNegative = number;
        if(number<0){
            number = -(number);
        }
int reverseNumber = 0;
        while (number>0){
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10;
            reverseNumber= reverseNumber+lastDigit;
            number = number / 10;
        }
        if(tempNegative<0){
            reverseNumber = -(reverseNumber);
        }
        return reverseNumber;

    }

    public static int getDigitCount(int number){
        if(number<0){
           return -1;
        }
        int count =0;
       do{
           int lastDigit = number%10;
           number = number/10;
           count++;

       }while(number>0);
 return count;

    }

}
