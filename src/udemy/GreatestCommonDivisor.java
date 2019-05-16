package udemy;


import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
       System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
       System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int firstDivisor = first;
        ArrayList<Integer> firstDivisorVal = new ArrayList<>();
        int secondDivisor = second;
        ArrayList<Integer> secondDivisorVal = new ArrayList<>();
        ArrayList<Integer> finalValList = new ArrayList<>();
        int tempNew = 0;
        do{
            int temp = first%firstDivisor;
            if(temp == 0){
                firstDivisorVal.add(firstDivisor);
            }
            firstDivisor--;

        }while(firstDivisor>0);

        do{
            int temp = second%secondDivisor;
            if(temp == 0){
                secondDivisorVal.add(secondDivisor);
            }
            secondDivisor--;

        }while(secondDivisor>0);

        for(int e:firstDivisorVal){
            for(int j:secondDivisorVal){
                if(e==j){
                    finalValList.add(e);
                }
            }
        }
        for(int e=0;e<finalValList.size();e++) {
           if (e+1 < finalValList.size()) {
                if (finalValList.get(e) > finalValList.get(e + 1) && finalValList.get(e)>tempNew) {
                    tempNew = finalValList.get(e);
                } else {
                    if(finalValList.get(e+1)>tempNew) {
                        tempNew = finalValList.get(e + 1);
                    }
                }
            }
        }

        return tempNew;
    }
}
