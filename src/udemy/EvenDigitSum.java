package udemy;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
       /* int sum = 0;
        int originalNumber = number;*/
        int evenDigit=0;
        if(number<0){
            return -1;
        }

        do{
            int temp = number %10;
            if(temp%2 == 0){
                evenDigit = evenDigit+temp;
            }
            number = number /10;

        }while(number>0);

        return evenDigit;
    }
}
