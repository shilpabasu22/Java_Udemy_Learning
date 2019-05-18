package udemy;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount<0 || smallCount<0 || goal <0){
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        if(sum>goal){
            int requiredBigBags = goal/5;
            int requiredSmallBags = goal%5;

            if(bigCount < requiredBigBags){
                int totalBagKilos = bigCount *5;
                return (goal % totalBagKilos) <= smallCount;
            }else{
                return requiredSmallBags <=smallCount;
            }

        }
        else{
            return (sum==goal);
        }

    }
}
