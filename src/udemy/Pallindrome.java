package udemy;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int num){
        boolean numberPallindrome;
        int reverse=0;
        int originalNumber = num;
        if(originalNumber<0){
            num = -(num);
            originalNumber = -(originalNumber);
        }
        while (num>0){
            int lastDigit = num % 10;
            reverse = reverse * 10;
            reverse= reverse+lastDigit;
            num = num / 10;
        }
        System.out.println("Number = "+originalNumber);
        System.out.println("Reverse = "+reverse);
        if(originalNumber == reverse){
            numberPallindrome = true;
        }else{
            numberPallindrome = false;
        }
        return numberPallindrome;
    }
}
