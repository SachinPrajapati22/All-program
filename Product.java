import java.util.*;
class Product {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any two nos to find product");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = product(a,b);
        System.out.println("product = " + res);
        sc.close();
    }
    public static int product(int n1, int n2) {
        int result = n1*n2;
        return result;
    }
}