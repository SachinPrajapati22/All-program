import java.util.*;
public class hollowRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of lines");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++) {
                if(i==1 || i==n || k==1 || k==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
