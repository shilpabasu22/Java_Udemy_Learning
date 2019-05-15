package udemy;

public class SharedDigit{
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,13));
    }
    public static boolean hasSharedDigit(int number1, int number2){
        boolean result = true;
        int finalNumber1 = number1;
        int originalNumber2 = number2;
        int finalNumber2 = number2;

        if((number1<10 || number1 >99) || (number2<10 || number2 >99)){
            result = false;
            return result;
        }

        do{
          int  temp1 = number1%10;
           do{
             int   temp2 = number2 % 10;
                if(temp1 == temp2){
                   result = true;
                   return result;
                }else{
                    number2 = number2 /10;
                }
            } while(number2>0);
           finalNumber2 = number2;
           finalNumber1 = number1;
           number2 = originalNumber2;
            number1 = number1 /10;

        }while(number1>0);
        if(finalNumber1 <10 && finalNumber2 <10 && finalNumber1 != finalNumber2){
            result = false;
            return false;
        }
        return result;
    }
}
