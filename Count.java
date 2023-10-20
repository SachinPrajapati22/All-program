import java.util.*;
public class Count {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no whose count to find");
        int Num = sc.nextInt();
        int Count = 0;

        while (Num != 0){
            Count++;
            Num/=10;
        }
        System.out.println("Total mo of digits is " + Count);
    }
}
