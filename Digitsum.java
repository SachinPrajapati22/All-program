import java.util.*;

public class Digitsum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no whose sum to be found");
        int Num = sc.nextInt();
        int Sum = 0;

        while(Num != 0){
            Sum = Sum + (Num%10); 
            Num/=10;
        }
        System.out.println("Sum is " + Sum);
    }
}
