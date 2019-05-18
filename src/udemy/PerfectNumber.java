package udemy;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number){
        if(number <1){
            return false;
        }
        int divisor = number -1;
        int sum=0;
        do{
            int dividend = number%divisor;
            if(dividend == 0){
                sum+=divisor;
            }
            divisor--;
        }while(divisor>0);

        if(sum == number){
            return true;
        }else{
            return false;
        }
    }
}
