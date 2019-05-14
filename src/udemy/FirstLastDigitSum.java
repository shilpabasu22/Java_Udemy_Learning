package udemy;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(101));
    }
    public static int sumFirstAndLastDigit(int number){
        int firstDigit;
        int lastDigit;
        int originalNumber;

        if(number<0){
            return -1;
        }

        lastDigit = number%10;
        System.out.println("Last Digit: "+lastDigit);
        do{
            if(number<10){
                firstDigit = number;
            }else {
                firstDigit = number / 10;
                number = number / 10;
            }

        }while(number>=10);
        System.out.println("First Digit: " + firstDigit);
        return firstDigit+lastDigit;
    }
}
