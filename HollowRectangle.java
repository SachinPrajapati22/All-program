import java.util.*;
public class HollowRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the length and breadth of rectangle");
        int len=sc.nextInt();
        int wid=sc.nextInt();

        for(int i=1; i<=wid; i++) {
            for(int j=1; j<=len; j++){ 
                if(i==1 || i==wid || j==1 || j==len) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }    
    }
}
