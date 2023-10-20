import java.util.*;

class Even {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range");
        int Num = sc.nextInt();
        
        for(int i=1; i<=Num; i++){
            if (i%2 == 0){
                System.out.println( i + " is an even number");
            }
            else{
                System.out.println( i + " is an odd number");
            }
        }
    }
}