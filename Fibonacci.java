import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range \n");

        int Num = sc.nextInt();
        int first = 0; 
        int second = 1;
        int next;
        System.out.println(first );
        System.out.println( second );
        for (int i=1; i<=Num; i++){
            next =first + second;
            System.out.println( next );
            first = second;
            second = next;
        }
        sc.close();
    }
}
