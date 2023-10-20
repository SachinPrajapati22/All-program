import java.util.*;
public class Armstrong {
    
    public static int count(int a) {
        int r=0;
        while(a!=0) {
            r+=1;
            a/=10;
           
        } return r;
    }
    public static int power(int a , int b) {
        int val = 0;
        while(a!=0) {
            a%=10;
            val+=Math.pow(a, b);
            a/=10;
        }
        return val;
    }
    public static void check(int c,int d) {
        if(c == d) {
            System.out.println(c + " is an armstrong no");
        }
        else {
            System.out.println(c + " is not an armstrong no");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the no to be checked as ");
        int num = sc.nextInt();
        int n = count(num);
        int p = power(num , n);
        check(num, p);
        sc.close();
    }
}
