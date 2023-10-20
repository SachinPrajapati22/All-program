import java.util.*;
public class Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter the no of rows");
         int n= sc.nextInt();
    /*
          *
         **
        ***
       ****
      *****
    */   
         for(int i=1; i<=n; i++) {
            for(int k=i; k<n; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
// 12345
// 1234
// 123
// 12
// 1
// 12
// 123
// 1234
// 12345
         System.out.println();

         for(int i=n; i>=1; i--) {
            for(int j=1;j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
         }
       
        for(int i=2; i<=n; i++) {
            for(int j=1;j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
         }
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

         System.out.println();
         int a = 1;
         for(int i=1; i<=5; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();

         }
         System.out.println();


         sc.close();
    }
}
