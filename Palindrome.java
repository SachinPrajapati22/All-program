import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int Num = sc.nextInt();
        int original = Num;
        int forcheck = Num;
        int count = 0;
        int Rev = 0;

        while(Num != 0){
            count++;
            Num/=10;
        }

        while(original != 0){
            Rev = Rev*10+(original % 10);
            original/=10;
        }
        if(Rev ==forcheck){
            System.out.println("It is a palindrome no");
        }
        else{
            System.out.println("It is not a palindrome no");
        }
        sc.close();
    }
}
