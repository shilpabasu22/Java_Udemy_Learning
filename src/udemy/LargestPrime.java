package udemy;

import java.util.ArrayList;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime (int number){
        int dividend;
        int divisor = number;
        ArrayList<Integer> dividendArray = new ArrayList<>();
        int returnValue = 0;
        if(number <=1){
            returnValue =  -1;
        }
       else {
            do {
                dividend = number % divisor;
                if (dividend == 0) {
                    dividendArray.add(divisor);
                }
                divisor--;

            } while (divisor > 1);

            if (dividendArray.size() > 1) {
                for (int i = 0; i < dividendArray.size(); i++) {
                    int dividendArrayDivisor = dividendArray.get(i) ;
                    int arrayDividend;
                    ArrayList<Integer> newArray = new ArrayList<>();
                    do {
                        arrayDividend = dividendArray.get(i) % dividendArrayDivisor;
                        if (arrayDividend == 0) {
                            newArray.add(dividendArrayDivisor);
                        }
                        dividendArrayDivisor--;

                    } while (dividendArrayDivisor > 1);
                    if (newArray.size() == 1) {
                        returnValue = newArray.get(0);
                        break;
                    }


                }

            } else if (dividendArray.size() == 1) {
                returnValue = number;

            }
        }
       return returnValue;

    }
}
