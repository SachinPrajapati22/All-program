import java.util.*;  
public class Factorial {
    public static int factorial(int a) {
        int fact = 1;
        if(a<=1) {
            return 1;
        }
        else {
            for(int i=2; i<=a; i++) {
                fact*=i;
            }
         }
        return fact;
    }
     public static int binoCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);
        int result = (n_fact)/(r_fact * nr_fact);
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no whose factorial to be find");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binoCoeff(n,r));
    }
    
   
}
