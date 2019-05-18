package udemy;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
      // printSquareStar(8);
    }
    public static void printSquareStar(int number){
        int column=number;
        if(number<5){
            System.out.println("Invalid Value");
        }else{
            for(int i=0;i<number;i++){
                for(int j=0;j<column;j++){
                    if(i==j || i==0 || j==0 || i==(number-1) || j == (column -1) || j ==(number-(i+1))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("\n");
            }
        }
    }
}
